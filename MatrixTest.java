import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;


public class MatrixTest {

    @Test
    public void createMatrix3_3(){
        int row = 3;
        int column = 3;
        int [][] firstData = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] expectedOutput = {{1,2,3},{4,5,6},{7,8,9}};

        Matrix MatrixOne = new Matrix(row,column,firstData);
        int[][] firstMatrix = MatrixOne.getMatrix();

        assertArrayEquals(firstMatrix,expectedOutput);
    }

    @Test
    public void createMatrix2_2() {
      int row = 2;
      int column = 2;
      int [][] firstData = {{1,2},{3,4}};
      int [][] expectedOutput = {{1,2},{3,4}};

      Matrix MatrixTwo = new Matrix(row,column,firstData);
      int[][] secondMatrix = MatrixTwo.getMatrix();

      assertArrayEquals(secondMatrix,expectedOutput);
    }

    @Test
    public void addTwoMatrices() {
      int [][] firstData = {{1,2,3},{4,5,6},{7,8,9}};
      int [][] secondData = {{1,2,3},{4,5,6},{7,8,9}} ;
      int [][] expectedOutput = {{2,4,6},{8,10,12},{14,16,18}};

      Matrix MatrixOne = new Matrix(3,3,firstData);
      Matrix MatrixTwo = new Matrix(3,3,secondData);

      int[][] additionResult = MatrixOne.addMatrix(MatrixTwo.getMatrix());

      assertArrayEquals(additionResult,expectedOutput);
    }

    @Test
    public void multiplyTwoMatrics() {
      int [][] firstData = {{1,2},{3,4}};
      int [][] secondData = {{1,2},{3,4}};
      int [][] expectedOutput = {{7,10},{15,22}};


      Matrix MatrixOne = new Matrix(3,3,firstData);
      Matrix MatrixTwo = new Matrix(3,3,secondData);

      int[][] additionResult = MatrixOne.multiplyMatrix(MatrixTwo.getMatrix());

      assertArrayEquals(additionResult,expectedOutput);
    }
}
