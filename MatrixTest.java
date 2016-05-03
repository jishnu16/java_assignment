import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;


public class MatrixTest {

    @Test
    public void createMatrixValuesAs2dArray(){
      int [][]values={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

      Matrix matrix = new MatrixBuilder(4,4,values).build();
      assertTrue(matrix.isEqualTo(new MatrixBuilder(4,4,values).build()));
    };

    @Test
	  public void addMatrixForSameRowColumn(){
  		int values1[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
  		Matrix matrix1 = new MatrixBuilder(4,4,values1).build();

  		int values2[][]={{10,20,30,40},{15,16,17,18},{29,12,1,12},{19,41,5,6}};
  		Matrix matrix2 = new MatrixBuilder(4,4,values2).build();

  		int expected[][]= {{11,22,33,44},{20,22,24,26},{38,22,12,24},{32,55,20,22}};
  		assertTrue(matrix1.addMatrix(matrix2).isEqualTo(new MatrixBuilder(4,4,expected).build()));
	  }

    // @Test
  	// public void addMatrixForDifferentRowColumn(){
  	// 	int values1[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
  	// 	Matrix matrix1 = new MatrixBuilder(4,4,values1).build();
    //
  	// 	int values2[][]={{10,20,30,40},{15,16,17,18},{29,12,1,12}};
  	// 	Matrix matrix2 = new MatrixBuilder(3,4,values2).build();
    //   String expected = "row and column must be same";
    //
    //   System.out.println(matrix1.addMatrix(matrix2));
    //   assertEquals(matrix1.add(matrix2),expected);
  	// 	int expected[][]= new int [0][0];
  	// 	assertTrue(matrix1.add(matrix2).isEqualTo(new MatrixBuilder(0,0,expected).build()));
  	// }

    @Test
	   public void matrixMultiplyForSquareMatrix(){
  		int values1[][]={{1,2,3},{4,6,7},{5,2,1}};
  		Matrix matrix1 = new MatrixBuilder(3,3,values1).build();

  		int values2[][]={{2,3,1},{6,4,2},{7,3,1}};
  		Matrix matrix2 = new MatrixBuilder(3,3,values2).build();
  		int expected[][] = {{35,20,8},{93,57,23},{29,26,10}};
  		assertTrue(matrix1.multiplyWith(matrix2).isEqualTo(new MatrixBuilder(3,3,expected).build()));
  	}

   @Test
     public void matrixDeterminantTestOF3By3Matrix() {
       int [][]data = {{2,4,3},{5,6,4},{5,6,2}};
       Matrix matrix = new MatrixBuilder(3,3,data).build();

       int result = matrix.determinant();
       assertEquals(16,result);
     }
}
