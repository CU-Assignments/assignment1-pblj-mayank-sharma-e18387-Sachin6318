import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions for the first matrix
        System.out.print("Enter number of rows for the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter number of columns for the first matrix: ");
        int cols1 = scanner.nextInt();

        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter elements of the first matrix:");
        readMatrix(scanner, matrix1);

        // Input dimensions for the second matrix
        System.out.print("Enter number of rows for the second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter number of columns for the second matrix: ");
        int cols2 = scanner.nextInt();

        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter elements of the second matrix:");
        readMatrix(scanner, matrix2);

        // Perform addition if possible
        if (rows1 == rows2 && cols1 == cols2) {
            System.out.println("Matrix Addition:");
            printMatrix(addMatrices(matrix1, matrix2));
        } else {
            System.out.println("Addition not possible: Matrices must have the same dimensions.");
        }

        // Perform subtraction if possible
        if (rows1 == rows2 && cols1 == cols2) {
            System.out.println("Matrix Subtraction:");
            printMatrix(subtractMatrices(matrix1, matrix2));
        } else {
            System.out.println("Subtraction not possible: Matrices must have the same dimensions.");
        }

        // Perform multiplication if possible
        if (cols1 == rows2) {
            System.out.println("Matrix Multiplication:");
            printMatrix(multiplyMatrices(matrix1, matrix2));
        } else {
            System.out.println("Multiplication not possible: Number of columns in first matrix must equal number of rows in second matrix.");
        }

        scanner.close();
    }

    // Reads a matrix from user input
    private static void readMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Adds two matrices
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Subtracts two matrices
    private static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Multiplies two matrices
    private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Prints a matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
