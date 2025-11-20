import java.util.*;

public class single_number_49 {

    // -------------------------------------------------------
    // Problem
    // You are given a non-empty array of integers nums.
    // Every element appears twice except for one.
    
    // Task
    //  -> Find the single number that appears only once.
    
    // Rules
    //  -> Must run in linear time O(n)
    //  -> Must use only constant extra space O(1)
    
    // Examples
    //  nums = [2,2,1]       -> 1
    //  nums = [4,1,2,1,2]   -> 4
    //  nums = [1]           -> 1
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method = XOR Operation
    
    // Idea
    //  -> XOR cancels out pairs:  a ^ a = 0
    //  -> XOR with 0 returns same number:  a ^ 0 = a
    //  -> Since all pairs cancel, leftover is the single number
    
    // Time Complexity  = O(n)
    // Space Complexity = O(1)
    // -------------------------------------------------------
    public static int single_number(int[] nums) {

        int result = 0;

        for (int n : nums) {
            result ^= n;   // XOR accumulates; duplicates cancel out
        }

        return result;
    }

    // MAIN method
    public static void main(String[] args) {

        int[] nums1 = {2, 2, 1};          // 1
        int[] nums2 = {4, 1, 2, 1, 2};    // 4
        int[] nums3 = {1};                // 1

        System.out.println("Result 1 = " + single_number(nums1));
        System.out.println("Result 2 = " + single_number(nums2));
        System.out.println("Result 3 = " + single_number(nums3));
    }
}

/*
Output

Result 1 = 1
Result 2 = 4
Result 3 = 1
*/
