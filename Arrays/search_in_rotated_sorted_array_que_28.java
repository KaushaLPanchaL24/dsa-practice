public class search_in_rotated_sorted_array_que_28 {

    // -------------------------------------------------------
    // method 1 = Optimized Approach using Modified Binary Search
    
	// Time Complexity = O(log n)
	// --> Because in each iteration, you reduce the search space by half (just like normal binary search).
	// --> So the number of steps grows logarithmically with the array size.
    
	// Space Complexity = O(1)
	// --> You only use a constant number of extra variables: low, high, mid, etc.
	// --> No extra data structures (like arrays, lists, or recursion stack) are used.
	// --> Therefore, space does not depend on input size — it stays constant.
    // -------------------------------------------------------
	
    public static int binary_search_rotated(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // if target found at mid
            if (nums[mid] == target) {
                return mid;
            }

            // check which half is sorted
            if (nums[low] <= nums[mid]) {
                
				// left half is sorted
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1; // move to left half
                } 
				else {
                    low = mid + 1;  // move to right half
                }
            } 
			else {
                // right half is sorted
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;  // move to right half
                } 
				else {
                    high = mid - 1; // move to left half
                }
            }
        }
        // target not found
        return -1;
    }


	// -------------------------------------------------------
	
	// Method 2 = Simple Linear Search ( Unoptimized )

	// Time Complexity = O(n)
	// --> Because the algorithm checks each element in the array one by one.
	// --> In the worst case, the target is at the end (or not present at all),
	//     so all n elements must be compared once.

	// Space Complexity = O(1)
	// --> Uses only a constant amount of extra space (e.g., loop variable i).
	// --> No additional data structures are used.
	// --> Therefore, the space requirement remains constant regardless of array size.
	
	// -------------------------------------------------------

    public static int linear_search(int[] nums, int target) {
        
		// iterate each element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i; // return index if found
            }
        }
        return -1; // target not found
    }


    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        // call Binary Search method
        int binary_result = binary_search_rotated(nums, target);

        // call Linear Search method
        int linear_result = linear_search(nums, target);

        System.out.println("Target = " + target);

        if (binary_result != -1) {
            System.out.println("Binary Search ( Optimized ) = Target found at index " + binary_result);
        } 
		else {
            System.out.println("Binary Search ( Optimized ) = Target not found");
        } 

        if (linear_result != -1) {
            System.out.println("Linear Search ( Normal ) = Target found at index " + linear_result);
        } 
		else {
            System.out.println("Linear Search ( Normal ) = Target not found");
        }
    }
}
