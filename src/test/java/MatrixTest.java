import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    Matrix matrixClass;

    @BeforeEach
    void setUp() {
       matrixClass = new Matrix();
    }

    @AfterEach
    void tearDown() {
        matrixClass = null;
    }

    @Test
    void isMatrixSquare00() {
        int[][] matrix = new int[0][0];
        assertFalse(matrixClass.isMatrixSquare(matrix));
    }

    @Test
    void isMatrixSquare55() {
        int[][] matrix = new int[5][5];
        assertTrue(matrixClass.isMatrixSquare(matrix));
    }

    @Test
    void isMatrixSquare56() {
        int[][] matrix = new int[5][6];
        assertFalse(matrixClass.isMatrixSquare(matrix));
    }

    @Test
    void isMatrixSquareToothed() {
        int[][] matrix = new int[][]{{1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
        assertFalse(matrixClass.isMatrixSquare(matrix));
    }
}