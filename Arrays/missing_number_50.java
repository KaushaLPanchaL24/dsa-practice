import java.util.*;

public class missing_number_50 {

    // -------------------------------------------------------
    // Problem
    // You are given an array nums containing n distinct numbers
    // in the range [0, n].
    
    // Task
    //  -> Return the only number in the range that is missing.
    
    // Rules
    //  -> nums contains distinct values
    //  -> All values are from 0 to n
    //  -> Exactly one number in this range is missing
    
    // Examples
    //  nums = [3,0,1]               -> 2
    //  nums = [0,1]                 -> 2
    //  nums = [9,6,4,2,3,5,7,0,1]   -> 8
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method = XOR Operation
    
    // Idea
    //  -> XOR all numbers from 0 to n
    //  -> XOR all numbers in the array
    //  -> Matching numbers cancel out (a ^ a = 0)
    //  -> The leftover value is the missing number
    
    // Time Complexity  = O(n)
    // Space Complexity = O(1)
    // -------------------------------------------------------
    public static int missing_number(int[] nums) {

        int result = nums.length;  // start with n

        for (int i = 0; i < nums.length; i++) {
            result ^= i;        // XOR with index
            result ^= nums[i];  // XOR with array value
        }

        return result;          // remaining value is missing
    }

    // MAIN method
    public static void main(String[] args) {

        int[] nums1 = {3, 0, 1};                       // 2
        int[] nums2 = {0, 1};                          // 2
        int[] nums3 = {9,6,4,2,3,5,7,0,1};             // 8

        System.out.println("Result 1 = " + missing_number(nums1));
        System.out.println("Result 2 = " + missing_number(nums2));
        System.out.println("Result 3 = " + missing_number(nums3));
    }
}

/*
Output

Result 1 = 2
Result 2 = 2
Result 3 = 8
*/
