class MatrixMain{
    public static void main(String[] args) {
        int row = 3;
        int column = 3;
        int [] firstData = {1,2,3,4,5,6,7,8,9};

        Matrix myFristMatrix = Matrix.createMatrix(row,column,firstData);
        int[][] firstMatrix = myFristMatrix.getMatrix();
        System.out.println(firstMatrix);
    }
}
