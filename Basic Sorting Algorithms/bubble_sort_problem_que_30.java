import java.util.*;

// Description = Implement Bubble Sort [ Optimized Version ]

public class bubble_sort_problem_que_30 {

    // -------------------------------------------------------
    // Method 1 = Optimized Bubble Sort
    
    // Time Complexity = O(n²)
    // --> In the worst case (when the array is in reverse order),
    //     bubble sort still compares adjacent elements repeatedly.
    // --> Best case = O(n) when the array is already sorted (early termination).
    
    // Space Complexity = O(1)
    // --> Uses only a few extra variables (like i, j, temp, swaps).
    // --> No extra data structures are used.
    // -------------------------------------------------------
	
    public static void bubble_sort(int[] nums) {
        int n = nums.length;

        // outer loop for each pass
        for (int i = 0; i < n - 1; i++) {
            int swaps = 0; // count swaps in each pass

            // inner loop to compare adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
				
                if (nums[j] > nums[j + 1]) {
					
                    // swap elements
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swaps++;
                }
            }

            // if no swaps happened in the first pass, array is already sorted
            if (swaps == 0 && i == 0) {
                System.out.println("Array is already sorted...");
                break;
            }
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
        int[] nums_unsorted = {22, 3, 4, 5};

        System.out.println("Input Array ( Unsorted ) = " + Arrays.toString(nums_unsorted));
        System.out.println("--------------------------------------------------");

        // call bubble sort on unsorted array
        bubble_sort(nums_unsorted);

        System.out.println("Sorted Array ( After Bubble Sort ) = ");
        display(nums_unsorted);

        System.out.println("\n==================================================\n");

        // ex 2 : Already sorted array
        int[] nums_sorted = {2, 5, 8, 10, 15};

        System.out.println("Input Array ( Already Sorted ) = " + Arrays.toString(nums_sorted));
        System.out.println("--------------------------------------------------");

        // call bubble sort on already sorted array
        bubble_sort(nums_sorted);

        System.out.println("Result ( After Bubble Sort ) = ");
        display(nums_sorted);
    }
}
