import java.util.Arrays;
import java.util.Collections;

// Description = Implement Inbuilt Sort Methods in Java 


    // -------------------------------------------------------
    // Method 1 = Inbuilt Sort ( Arrays.sort() )
    
    // Time Complexity = O(n log n)
    // --> Uses Dual-Pivot QuickSort for primitive types (int, char, etc.).
    // --> For objects (like Integer), uses TimSort — a hybrid of Merge + Insertion Sort.
    
    // Space Complexity = O(n)
    // --> Requires additional memory when using TimSort for non-primitive types.
    // --> For primitive arrays, it's optimized to use minimal extra space.
    
    // Notes :
    // --> Works faster than O(n²) algorithms like Bubble, Selection, or Insertion Sort.
    // --> Supports both full-array and partial range sorting.
    // --> Supports reverse order sorting only for non-primitive (wrapper) types.
    // -------------------------------------------------------
    
    
public class inbuilt_sort_java_que_33 {

    // -------------------------------------------------------
    // Method to display int array elements ( normal array )
    // -------------------------------------------------------
    public static void display(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    // -------------------------------------------------------
    // Method to display Integer array elements 
    // ( used for reverse sorting with Collections.reverseOrder )
    // -------------------------------------------------------
    public static void display_reverse(Integer[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    // -------------------------------------------------------
    // MAIN METHOD
    // -------------------------------------------------------
    public static void main(String[] args) {

        // Example 1 : Using int[] array ( ascending sort )
        int[] nums_unsorted = {5, 4, 1, 3, 2};

        System.out.println("Input Array ( int type ) = " + Arrays.toString(nums_unsorted));
        System.out.println("--------------------------------------------------");

        // full ascending sort
        Arrays.sort(nums_unsorted);
        System.out.println("Array Ascending Order ( Full Sort ) = ");
        display(nums_unsorted);

        System.out.println("\n==================================================\n");




        // Example 2 : Using int[] array ( range ascending sort )
        int[] nums_range_asc = {9, 7, 5, 3, 1, 8};

        System.out.println("Input Array ( For Range Ascending Sort ) = " + Arrays.toString(nums_range_asc));
        System.out.println("--------------------------------------------------");

        // sort only from index 0 to 3 (elements: 9, 7, 5)
        Arrays.sort(nums_range_asc, 0, 3);

        System.out.println("Array ( Index 0 to 2 Sorted Ascending ) = ");
        display(nums_range_asc);

        System.out.println("\n==================================================\n");




        // Example 3 : Using Integer[] array ( full descending sort )
        Integer[] nums_unsorted_2 = {3, 2, 6, 8, 32, 1};

        System.out.println("Input Array ( Integer type ) = " + Arrays.toString(nums_unsorted_2));
        System.out.println("--------------------------------------------------");

        // sorting in descending order using Collections.reverseOrder()
        Arrays.sort(nums_unsorted_2, Collections.reverseOrder());

        System.out.println("Array Descending Order ( Full Sort ) = ");
        display_reverse(nums_unsorted_2);

        System.out.println("\n==================================================\n");




        // Example 4 : Using Integer[] array ( range descending sort )
        Integer[] nums_range_desc = {5, 9, 1, 7, 3, 8, 2};

        System.out.println("Input Array ( For Range Descending Sort ) = " + Arrays.toString(nums_range_desc));
        System.out.println("--------------------------------------------------");

        // sort elements from index 0 to 3 in reverse order
        Arrays.sort(nums_range_desc, 0, 3, Collections.reverseOrder());

        System.out.println("Array ( Index 0 to 2 Descending ) = ");
        display_reverse(nums_range_desc);
    }
}


/* 
Output :

Input Array ( int type ) = [5, 4, 1, 3, 2]
--------------------------------------------------
Array Ascending Order ( Full Sort ) = 
1 2 3 4 5 

==================================================

Input Array ( For Range Ascending Sort ) = [9, 7, 5, 3, 1, 8]
--------------------------------------------------
Array ( Index 0 to 2 Sorted Ascending ) = 
5 7 9 3 1 8 

==================================================

Input Array ( Integer type ) = [3, 2, 6, 8, 32, 1]
--------------------------------------------------
Array Descending Order ( Full Sort ) = 
32 8 6 3 2 1 

==================================================

Input Array ( For Range Descending Sort ) = [5, 9, 1, 7, 3, 8, 2]
--------------------------------------------------
Array ( Index 0 to 2 Descending ) = 
9 5 1 7 3 8 2 

*/