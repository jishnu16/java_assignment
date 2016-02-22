public class MatrixBuilder{
	private Matrix matrix;

	public MatrixBuilder(int rowSize,int columnSize,int [][]values){
		matrix = Matrix.createMatrix(rowSize,columnSize,values);
	}

	public Matrix build(){
		return matrix;
	}
}
