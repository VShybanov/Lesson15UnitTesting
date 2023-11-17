import java.util.Arrays;

public class Lesson15 {
    public static void main(String[] args) {
        Matrix matrixClass = new Matrix();

        int[][] matrix1 = new int[0][0];
        int[][] matrix2 = new int[5][5];
        int[][] matrix3 = new int[5][6];
        int[][] matrix4 = new int[][]{{1, 2}, {1, 2, 3}, {1, 2, 3, 4}};

        System.out.println("Matrix 1:");
        for (int i = 0; i < matrix1.length; i++) {
            System.out.println(Arrays.toString(matrix1[i]));
        }
        System.out.println("The square matrix - " + matrixClass.isMatrixSquare(matrix1));
        System.out.println();

        System.out.println("Matrix 2:");
        for (int i = 0; i < matrix2.length; i++) {
            System.out.println(Arrays.toString(matrix2[i]));
        }
        System.out.println("The square matrix - " + matrixClass.isMatrixSquare(matrix2));
        System.out.println();

        System.out.println("Matrix 3:");
        for (int i = 0; i < matrix3.length; i++) {
            System.out.println(Arrays.toString(matrix3[i]));
        }
        System.out.println("The square matrix - " + matrixClass.isMatrixSquare(matrix3));
        System.out.println();

        System.out.println("Matrix 4:");
        for (int i = 0; i < matrix4.length; i++) {
            System.out.print(Arrays.toString(matrix4[i]) + " ");
            System.out.println("Average value = " + matrixClass.avgArray(matrix4[i]));
        }
        System.out.println("The square matrix - " + matrixClass.isMatrixSquare(matrix4));
    }
}
