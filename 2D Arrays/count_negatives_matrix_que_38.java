import java.util.*;

public class count_negatives_matrix_que_38 {

    // -------------------------------------------------------
    // Problem: Count Negative Numbers in a Sorted Matrix (LeetCode = 1351)
    
    // Given a m x n matrix `grid` sorted in non-increasing order 
    // both row-wise and column-wise, return the number of negative numbers in `grid`.
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method 1 = Optimized Approach (O(m + n))
    //
    // Idea:
    // --> Start from bottom-left corner.
    // --> If grid[i][j] < 0 → all elements to the right (in that row) are also negative.
    //     So, count += (n - j), then move one row up (i--).
    // --> Else, move right (j++).
    //
    // Time Complexity = O(m + n)
    // --> Each step moves up or right at most once per iteration.
    //
    // Space Complexity = O(1)
    // --> Constant extra space used.
    // -------------------------------------------------------

    public static int countNegatives_optimized(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        int i = m - 1; // start from bottom-left
        int j = 0;

        while (i >= 0 && j < n) {
            if (grid[i][j] < 0) {
                // All elements to the right are negative
                count += (n - j);
                i--; // move up
            } else {
                j++; // move right
            }
        }
        return count;
    }

    // -------------------------------------------------------
    // Method 2 = Brute Force (Unoptimized) Approach
    //
    // Idea:
    // --> Iterate through every element and count if it's negative.
    //
    // Time Complexity = O(m * n)
    // --> Checks every element.
    //
    // Space Complexity = O(1)
    // --> Uses only a counter.
    // -------------------------------------------------------

    public static int countNegatives_bruteforce(int[][] grid) {
        int count = 0;
        for (int[] row : grid) {
            for (int num : row) {
                if (num < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // -------------------------------------------------------
    // Main Method for Testing
    // -------------------------------------------------------
    public static void main(String[] args) {

        int[][] grid = {
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
        };

        System.out.println("Input Matrix : ");
        for (int[] row : grid) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("--------------------------------------------------\n");

        // Method 1 = Brute Force
        int brute_force_result = countNegatives_bruteforce(grid);

        // Method 2 = Optimized
        int optimized_result = countNegatives_optimized(grid);

        // Display Results
        System.out.println("Brute Force [ Unoptimized ] Result : " + brute_force_result);
        System.out.println("--------------------------------------------------");
        System.out.println("Optimized Two-Pointer Result : " + optimized_result);
    }
}


/*
Expected Output:

Input Matrix : 
[4, 3, 2, -1]
[3, 2, 1, -1]
[1, 1, -1, -2]
[-1, -1, -2, -3]
--------------------------------------------------

Brute Force [ Unoptimized ] Result : 8
--------------------------------------------------
Optimized Two-Pointer Result : 8

*/
