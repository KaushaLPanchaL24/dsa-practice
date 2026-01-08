import java.util.*;

public class house_robber_63 {

    // -------------------------------------------------------
    // Problem
    // You are a professional robber planning to rob houses
    // along a street.
    
    // Each house has some amount of money.
    // You cannot rob two adjacent houses because
    // their security systems are connected.
    
    // Given an integer array nums,
    // return the maximum amount of money you can rob
    // without alerting the police.
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Examples
    // nums = [1,2,3,1]     → 4
    // nums = [2,7,9,3,1]   → 12
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method = Dynamic Programming (Optimized Space)
    
    // Idea
    //  -> At each house, you have two choices:
    //     1. Rob it  → add money to dp[i - 2]
    //     2. Skip it → take dp[i - 1]
    
    //  -> Use two variables instead of an array
    //     prev1 = dp[i - 1]
    //     prev2 = dp[i - 2]
    
    // Transition:
    //  curr = max(prev1, prev2 + current_house_money)
    
    // Time Complexity  = O(n)
    // Space Complexity = O(1)
    // -------------------------------------------------------
    public static int rob(int[] nums) {

        // Edge cases
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int prev2 = 0; // dp[i - 2]
        int prev1 = 0; // dp[i - 1]

        for (int money : nums) {
            int curr = Math.max(prev1, prev2 + money);
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }

    // MAIN method
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 1};       // expected = 4
        int[] nums2 = {2, 7, 9, 3, 1};    // expected = 12
        int[] nums3 = {5, 1, 1, 5};       // expected = 10

        System.out.println("Result 1 = " + rob(nums1));
        System.out.println("Result 2 = " + rob(nums2));
        System.out.println("Result 3 = " + rob(nums3));
    }
}

/*
Output

Result 1 = 4
Result 2 = 12
Result 3 = 10
*/
