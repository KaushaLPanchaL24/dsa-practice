import java.util.*;

// Description = Implement Selection Sort 

public class selection_sort_problem_que_31 {

    // -------------------------------------------------------
    // Method 1 = Selection Sort 
    
    // Time Complexity = O(n²)
    // --> Two nested loops are used.
    // --> For each element, we find the smallest element in the remaining array.
    // --> Comparisons increase quadratically with input size.
    
    // Space Complexity = O(1)
    // --> Uses a constant amount of extra space (variables like i, j, temp, etc.).
    // --> Sorting is done in-place without additional data structures.
    
    // Note :
    // --> Performs fewer swaps compared to Bubble Sort.
    // --> However, Selection Sort is not stable ( equal elements may change order ).
    // -------------------------------------------------------
	
    public static void selection_sort(int[] nums) {
        int n = nums.length;

        // outer loop - iterates through all positions
        for (int i = 0; i < n - 1; i++) {
            int minimum_position = i;

            // inner loop - find the index of the smallest element
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minimum_position]) {
                    minimum_position = j;
                }
            }

            // swap current element with smallest found
            int temp = nums[minimum_position];
            nums[minimum_position] = nums[i];
            nums[i] = temp;
        }
    }

    // Method to display array elements
    public static void display(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    // MAIN METHOD
    public static void main(String[] args) {

        // ex 1 : Unsorted array
        int[] nums_unsorted = {22, 3, 99, 4, 5, 31, 44, 2, 1};

        System.out.println("Input Array ( Unsorted ) = " + Arrays.toString(nums_unsorted));
        System.out.println("--------------------------------------------------");

        // call selection sort on unsorted array
        selection_sort(nums_unsorted);

        System.out.println("Sorted Array ( After Selection Sort ) = ");
        display(nums_unsorted);
    }
}
