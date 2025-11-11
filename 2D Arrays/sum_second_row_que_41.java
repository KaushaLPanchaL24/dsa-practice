import java.util.*;

public class sum_second_row_que_41 {

    // -------------------------------------------------------
    // Problem
    // Print the sum of numbers in the second row of a 2D array [ Matrix ].
    
    // Example
    // Input  = int[][] nums = { {1,4,9}, {11,4,3}, {2,2,3} };
    // Output = 18
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method 1 = Using Enhanced For Loop
    
    // --> Directly access the second row ( index = 1 )
    // --> Iterate through its elements and sum them.
    
    // Time Complexity = O(n)
    // Space Complexity = O(1)
    // -------------------------------------------------------
    public static int sum_second_row_method_1(int[][] nums) {
        int sum = 0;

        // the array has at least 2 rows
        if (nums.length < 2) {
            System.out.println("Array does not have a second row....!");
            return 0;
        }

        for (int num : nums[1]) {
            sum += num;
        }
        return sum;
    }

    // -------------------------------------------------------
    // Method 2 = Using Nested Loops
    
    // --> Loop through all rows
    // --> Only sum the row where i == 1
    
    // Time Complexity = O(m + n) ≈ O(n)
    // Space Complexity = O(1)
    // -------------------------------------------------------
    public static int sum_second_row_method_2(int[][] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 1) { // second row
                for (int j = 0; j < nums[i].length; j++) {
                    sum += nums[i][j];
                }
            }
        }
        return sum;
    }

    public static void print_matrix(int[][] nums) {
        for (int[] row : nums) {
            System.out.println(Arrays.toString(row));
        }
    }

    // MAIN METHOD 
    public static void main(String[] args) {
        int[][] nums = {
            {1, 4, 9},
            {11, 4, 3},
            {2, 2, 3}
        };

        System.out.println("Input Matrix = ");
        print_matrix(nums);
        System.out.println("--------------------------------------------------");

        int result1 = sum_second_row_method_1(nums);
        System.out.println("Method 1 [ Enhanced For Loop ] -> Sum of 2nd Row = " + result1);

        int result2 = sum_second_row_method_2(nums);
        System.out.println("Method 2 [ Nested Loops ] -> Sum of 2nd Row = " + result2);
    }
}

/*

Output

Input Matrix = 
[1, 4, 9]
[11, 4, 3]
[2, 2, 3]
--------------------------------------------------
Method 1 [ Enhanced For Loop ] -> Sum of 2nd Row = 18
Method 2 [ Nested Loops ] -> Sum of 2nd Row = 18

*/
