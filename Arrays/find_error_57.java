import java.util.*;

public class find_error_57 {

    // -------------------------------------------------------
    // Problem
    // You are given an array nums which originally represented
    // numbers from 1 to n (exactly once each).
    
    // Because of an error =
    //  -> One number appears twice
    //  -> One number is missing
    
    // Return [duplicate, missing]
    
    // Examples =
    //  nums = [1,2,2,4] -> [2,3]
    //  nums = [1,1]     -> [1,2]
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method = Frequency Count (O(n))
    
    // Idea
    //  -> Create freq[] to count occurrences of each number.
    //  -> The number with freq = 2 → duplicate
    //  -> The number with freq = 0 → missing
    
    // Time Complexity  = O(n)
    // Space Complexity = O(n)
    // -------------------------------------------------------
    public static int[] find_error_nums(int[] nums) {

        int n = nums.length;
        int[] freq = new int[n + 1];

        int dup = -1, missing = -1;

        // Count frequency of each number
        for (int x : nums) {
            freq[x]++;
        }

        // Find duplicate and missing
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) dup = i;
            if (freq[i] == 0) missing = i;
        }

        return new int[]{dup, missing};
    }

    // MAIN method
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 4};   // [2,3]
        int[] nums2 = {1, 1};         // [1,2]
        int[] nums3 = {3,2,2};        // [2,1]

        System.out.println(Arrays.toString(find_error_nums(nums1)));
        System.out.println(Arrays.toString(find_error_nums(nums2)));
        System.out.println(Arrays.toString(find_error_nums(nums3)));
    }
}

/*
Output
[2, 3]
[1, 2]
[2, 1]
*/
