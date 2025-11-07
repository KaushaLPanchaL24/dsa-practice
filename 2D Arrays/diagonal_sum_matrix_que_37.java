import java.util.*;

public class diagonal_sum_matrix_que_37 {

    // -------------------------------------------------------
    // Problem: Matrix Diagonal Sum (LeetCode = 1572)
	
    // Given a square matrix `mat`, return the sum of the matrix diagonals.
    // Only include the primary and secondary diagonals.
    // If the matrix has an odd size, the center element should be counted only once.
    
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method 1 = Optimized Single Loop Approach
    
    // Time Complexity = O(n)
    // --> We iterate once through the rows (or columns) of the matrix.
    // --> Each iteration adds the primary and (if different) secondary diagonal elements.
    
    // Space Complexity = O(1)
    // --> No extra data structures are used — only a variable for the sum.
    
    // Explanation = 
    // --> Primary diagonal index: mat[i][i]
    // --> Secondary diagonal index: mat[i][n - i - 1]
    // --> Skip duplicate addition if both indices point to the same element.
    // -------------------------------------------------------

    public static int diagonalSum_optimized(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            // primary diagonal element
            sum += mat[i][i];

            // secondary diagonal element [ avoid double-counting center ]
            if (i != n - i - 1){
                sum += mat[i][n - i - 1];
			}
        }
        return sum;
    }

    // -------------------------------------------------------
    // Method 2 = Brute Force (Unoptimized) Approach
    
    // Time Complexity = O(n²)
    // --> Checks every element and adds it if it belongs to a diagonal.
    
    // Space Complexity = O(1)
    // --> No additional space used except the sum variable.
    
    // Explanation:
    // --> Uses nested loops to check:
    //        1. Primary diagonal: i == j
    //        2. Secondary diagonal: i + j == n - 1
    // -------------------------------------------------------

    public static int diagonalSum_bruteforce(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    // primary diagonal
                    sum += mat[i][j];
                } 
				else if (i + j == n - 1) {
                    // secondary diagonal
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }

	// main method
    public static void main(String[] args) {

        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Input Matrix : ");
        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("--------------------------------------------------\n");

        // method 1 = Brute Force
        int brute_force_result = diagonalSum_bruteforce(mat);

        // method 2 = Optimized
        int optimized_result = diagonalSum_optimized(mat);

        // Display Results
        System.out.println("Brute Force [ Unoptimized ] Result : " + brute_force_result);
        System.out.println("--------------------------------------------------");
        System.out.println("Optimized Single Loop Result : " + optimized_result);
    }
}



/*

Output :

Input Matrix : 
[1, 2, 3]
[4, 5, 6]
[7, 8, 9]
--------------------------------------------------

Brute Force [ Unoptimized ] Result : 25
--------------------------------------------------
Optimized Single Loop Result : 25

*/