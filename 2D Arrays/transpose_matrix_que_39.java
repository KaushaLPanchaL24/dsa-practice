import java.util.*;

public class transpose_matrix_que_39 {

    // -------------------------------------------------------
    // Problem: Transpose Matrix [ LeetCode = 867 ]
    
    // Given a 2D integer array `matrix`, return the transpose of the matrix.
    
    // The transpose of a matrix is obtained by flipping it over its main diagonal,
    // switching the matrix's row and column indices.
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Approach =
    
    // --> Let matrix dimensions be m x n.
    // --> The transposed matrix will have dimensions n x m.
    // --> For each element matrix[i][j], place it at result[j][i].
    
    // Time Complexity = O(m * n)
    // --> Each element is visited once.
    
    // Space Complexity = O(m * n)
    // --> A new matrix is created for the result.
    // -------------------------------------------------------

    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;        // rows
        int n = matrix[0].length;     // columns

        int[][] result = new int[n][m];  // transposed dimensions

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = matrix[i][j];	// value set in the result matrix
            }
        }

        return result;
    }

	// matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

	// MAIN Method
    public static void main(String[] args) {

        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("Input Matrix 1 = ");
        printMatrix(matrix1);
        System.out.println("--------------------------------------------------");

        int[][] result1 = transpose(matrix1);

        System.out.println("Transposed Matrix 1 = ");
        printMatrix(result1);

        System.out.println("\n==================================================\n");

        System.out.println("Input Matrix 2 = ");
        printMatrix(matrix2);
        System.out.println("--------------------------------------------------");

        int[][] result2 = transpose(matrix2);

        System.out.println("Transposed Matrix 2 = ");
        printMatrix(result2);
    }
}

/*
Output =

Input Matrix 1 = 
[1, 2, 3]
[4, 5, 6]
[7, 8, 9]
--------------------------------------------------
Transposed Matrix 1 = 
[1, 4, 7]
[2, 5, 8]
[3, 6, 9]

==================================================

Input Matrix 2 = 
[1, 2, 3]
[4, 5, 6]
--------------------------------------------------
Transposed Matrix 2 = 
[1, 4]
[2, 5]
[3, 6]
*/
