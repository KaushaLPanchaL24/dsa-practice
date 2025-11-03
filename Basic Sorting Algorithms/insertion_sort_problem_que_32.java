import java.util.*;

// Description = Implement Insertion Sort 

public class insertion_sort_problem_que_32 {

    // -------------------------------------------------------
    // Method 1 = Insertion Sort 
    
    // Time Complexity = O(n²)
    // --> In the worst case (when the array is in reverse order),
    //     every element needs to be compared with all previous elements.
    // --> Best case = O(n) when the array is already sorted 
    //     (only one comparison per element).
    
    // Space Complexity = O(1)
    // --> Uses only a few extra variables (like i, current, prev).
    // --> Sorting is done in-place without any extra data structures.
    
    // Note :
    // --> Works efficiently for small or nearly sorted arrays.
    // --> More stable than Selection Sort (keeps equal elements in order).
    // -------------------------------------------------------

    public static void insertion_sort(int[] nums) {
        int n = nums.length;

        // outer loop - starts from the 2nd element ( index 1 )
        for (int i = 1; i < n; i++) {
            int current = nums[i];   // element to insert
            int prev = i - 1;        // index of previous element
            
            // shift elements of the sorted part that are greater than 'current'
            while (prev >= 0 && nums[prev] > current) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            
            // insert the current element at the correct position
            nums[prev + 1] = current;
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

        int[] nums_unsorted = {5, 4, 1, 3, 2};

        System.out.println("Input Array ( Unsorted ) = " + Arrays.toString(nums_unsorted));
        System.out.println("--------------------------------------------------");

        // call insertion sort on unsorted array
        insertion_sort(nums_unsorted);

        System.out.println("Sorted Array ( After Insertion Sort ) = ");
        display(nums_unsorted);
		
    }
}