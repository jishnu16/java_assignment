import java.util.Arrays;

class Matrix{
    private int row;
    private int column;
    private int [][] matrix;

    public Matrix(int noOfRows,int noOfColumn,int[][]data){
        this.row = noOfRows;
        this.column = noOfColumn;
        matrix = new int[row][column];
        initializedWithData(data);
    }

    private void initializedWithData(int [][] data){
        matrix = data;
    }

    public static Matrix createMatrix(int noOfRow,int noOfColumn,int[][] values){
		    return new Matrix(noOfRow,noOfColumn,values);
	  }

    public boolean isEqualTo(Matrix expected){
		    return Arrays.deepEquals(matrix,expected.matrix);
	  }

    public Matrix addMatrix(Matrix otherMatrix){
  		if (otherMatrix.column!=this.column || otherMatrix.row!=this.row) {
        throw new IllegalArgumentException("row and column must be same");
  		}
  		int [][]otherMatrixValues = otherMatrix.matrix;
  		int[][] result = new int[row][column];
  		for (int i=0;i<row;i++) {
  			for (int j=0;j<column ;j++ ){
  				result[i][j] = this.matrix[i][j] + otherMatrixValues[i][j];
  			}
  		}
  		Matrix resultMatrix = new Matrix(row,column,result);
  		return resultMatrix;
	}
    public Matrix multiplyWith(Matrix otherMatrix){
      if (column!=otherMatrix.row || row !=otherMatrix.column) {
        throw new IllegalArgumentException("row and column must be same");
      }
      int [][]result = new int[row][otherMatrix.column];
      for (int i=0;i<row ;i++ ) {
        for (int j=0;j<row ;j++ ) {
          int sum = 0;
          for (int k=0;k<column ;k++ ) {
            sum	+=matrix[i][k]*otherMatrix.matrix[k][j];
          }
          result[i][j]=sum;
        }
      }
      return new Matrix(row,otherMatrix.column,result);
  }
  public int determinant(){
    return findDeterminant(this.matrix);
  }

  private int findDeterminant(int [][] matrix){
    int value = 0;
    if(matrix.length == 1)
      return(matrix[0][0]);
    for(int i = 0 ; i < matrix.length ; i++){
      int [][] coefficientMatrix = findCofficient(matrix,i);
      int signValue = (i % 2 == 0) ? 1 : -1;
      value += signValue*matrix[0][i]*(findDeterminant(coefficientMatrix));
    }
    return value;
  }

  private int[][] findCofficient(int [][]matrix,int index){
    int[][]coefficient = new int[matrix.length-1][matrix.length-1];
    for(int i = 1 ; i < matrix.length ; i++){
      for(int j = 0 ; j < matrix.length ; j++){
        if(j < index)
          coefficient[i-1][j] = matrix[i][j];
        if(j > index)
          coefficient[i-1][j-1] = matrix[i][j];
      }
    }
    return coefficient;
  }
}
