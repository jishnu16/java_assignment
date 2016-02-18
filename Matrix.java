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

    public int[][] addMatrix(int [][] otherMatrix){
      int[][] result = new int[otherMatrix.length][otherMatrix[0].length];
      for(int i = 0; i < otherMatrix.length; i++){
			     for(int j = 0; j < otherMatrix[i].length;j++){
				         result[i][j] = otherMatrix[i][j] + this.matrix[i][j];
			      }
		     }
     return new Matrix(row,column,result).getMatrix();
    }

    public int[][] multiplyMatrix(int [][] otherMatrix){
      int[][] result = new int[otherMatrix.length][otherMatrix[0].length];
      for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                for(int k = 0; k < otherMatrix.length; k++) {
                    result[i][j] += this.matrix[i][k] * otherMatrix[k][j];
                }
            }
        }
      return new Matrix(row,column,result).getMatrix();
    }



    public int[][] getMatrix(){
        return matrix;
    }
}
