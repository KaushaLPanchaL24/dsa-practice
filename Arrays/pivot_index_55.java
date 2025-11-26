import java.util.*;

public class pivot_index_55 {

    // -------------------------------------------------------
    // Problem
    // You are given an integer array nums.
    
    // The pivot index is the index where the sum of all
    // elements strictly to the left equals the sum of all
    // elements strictly to the right.
    
    // If the pivot is at index 0, left sum = 0.
    // If the pivot is at the last index, right sum = 0.
    
    // Return the LEFTMOST pivot index. If none exists,
    // return -1.
    
    // Examples
    //  nums = [1,7,3,6,5,6] -> 3
    //  nums = [1,2,3]       -> -1
    //  nums = [2,1,-1]      -> 0
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method = Prefix Sum Check (O(n))
    
    // Idea
    //  -> Compute total sum of array.
    //  -> Traverse array maintaining a running left sum.
    //  -> At each index i:
    //         right_sum = total - left_sum - nums[i]
    //         if left_sum == right_sum → pivot found
    
    // Time Complexity  = O(n)
    // Space Complexity = O(1)
    // -------------------------------------------------------
    public static int pivot_index(int[] nums) {

        int total = 0;

        // compute full array sum
        for (int x : nums) {
            total += x;
        }

        int left_sum = 0;

        // check for pivot index
        for (int i = 0; i < nums.length; i++) {

            int right_sum = total - left_sum - nums[i];

            if (left_sum == right_sum) {
                return i;  // leftmost pivot
            }

            left_sum += nums[i];  // update for next iteration
        }

        return -1;  // no pivot index exists
    }

    // MAIN method
    public static void main(String[] args) {

        int[] nums1 = {1, 7, 3, 6, 5, 6};   
        int[] nums2 = {1, 2, 3};        
        int[] nums3 = {2, 1, -1};           
        int[] nums4 = {0, 0, 0, 0};         

        int r1 = pivot_index(nums1);
        int r2 = pivot_index(nums2);
        int r3 = pivot_index(nums3);
        int r4 = pivot_index(nums4);

        System.out.println("Result 1 = " + r1);
        System.out.println("Result 2 = " + r2);
        System.out.println("Result 3 = " + r3);
        System.out.println("Result 4 = " + r4);
    }
}

/*
Output

Result 1 = 3
Result 2 = -1
Result 3 = 0
Result 4 = 0
*/
