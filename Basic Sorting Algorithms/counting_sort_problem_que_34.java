import java.util.*;

// Description = Implement Counting Sort 

public class counting_sort_problem_que_34 {

    // -------------------------------------------------------
    // Method 1 = Counting Sort 
    
    // Time Complexity = O(n + k)
    // --> n = number of elements in the input array.
    // --> k = range of input (maximum element value).
    // --> Counting each occurrence takes O(n),
    //     and rebuilding the sorted array takes O(k).
    
    // Space Complexity = O(k)
    // --> Uses an extra count[] array of size (largest + 1).
    // --> Sorting is done using additional space proportional to the max value.
    
    // Note :
    // --> Works efficiently for small ranges of integers (e.g., 0–1000).
    // --> Not suitable for arrays with large value ranges.
    // --> Stable if implemented carefully with prefix sums (not in this simple version).
    // -------------------------------------------------------

    public static void counting_sort(int[] nums) {

        // Step 1: find the largest element
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }

        // Step 2: create frequency (count) array
        int[] count = new int[largest + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        // Step 3: rebuild the sorted array
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    // -------------------------------------------------------
    // Method to display array elements
    // -------------------------------------------------------
    public static void display(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    // -------------------------------------------------------
    // MAIN METHOD
    // -------------------------------------------------------
    public static void main(String[] args) {

        int[] nums_unsorted = {1, 4, 1, 3, 2, 4, 3, 7};

        System.out.println("Input Array ( Unsorted ) = " + Arrays.toString(nums_unsorted));
        System.out.println("--------------------------------------------------");

        // call counting sort on unsorted array
        counting_sort(nums_unsorted);

        System.out.println("Sorted Array ( After Counting Sort ) = ");
        display(nums_unsorted);
    }
}

/*
Output

Input Array ( Unsorted ) = [1, 4, 1, 3, 2, 4, 3, 7]
--------------------------------------------------
Sorted Array ( After Counting Sort ) = 
1 1 2 3 3 4 4 7 


*/
