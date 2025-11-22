import java.util.*;

public class move_zeroes_51 {

    // -------------------------------------------------------
    // Problem
    // You are given an integer array nums.
    // Move all 0's to the end of the array while keeping the
    // relative order of the non-zero elements.
    
    // Task
    //  -> Modify the array in-place to move all zeros to the end.
    
    // Rules
    //  -> Must be done in-place (no extra array)
    //  -> Maintain the order of non-zero elements
    //  -> Minimize the total number of operations
    
    // Examples
    //  nums = [0,1,0,3,12]   -> [1,3,12,0,0]
    //  nums = [0]            -> [0]
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method = Two-Pointer Technique
    
    // Idea
    //  -> Use insert_pos to track where next non-zero should go
    //  -> First pass: move all non-zero elements forward
    //  -> Second pass: fill remaining positions with zeros
    
    // Time Complexity  = O(n)
    // Space Complexity = O(1)
    // -------------------------------------------------------
    public static void move_zeroes(int[] nums) {

        int insert_pos = 0;  // position to place the next non-zero element

        // Step 1 = Move all non-zero elements forward
        for (int n : nums) {
            if (n != 0) {
                nums[insert_pos] = n;
                insert_pos++;
            }
        }

        // Step 2 = Fill the rest with zeros
        while (insert_pos < nums.length) {
            nums[insert_pos] = 0;
            insert_pos++;
        }
    }

    // MAIN method
    public static void main(String[] args) {

        int[] nums1 = {0, 1, 0, 3, 12};   // [1,3,12,0,0]
        int[] nums2 = {0};               // [0]
        int[] nums3 = {1, 0, 2, 0, 3};   // [1,2,3,0,0]

        move_zeroes(nums1);
        move_zeroes(nums2);
        move_zeroes(nums3);

        System.out.println("Result 1 = " + Arrays.toString(nums1));
        System.out.println("Result 2 = " + Arrays.toString(nums2));
        System.out.println("Result 3 = " + Arrays.toString(nums3));
    }
}

/*
Output

Result 1 = [1, 3, 12, 0, 0]
Result 2 = [0]
Result 3 = [1, 2, 3, 0, 0]
*/
