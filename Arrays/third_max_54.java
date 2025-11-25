import java.util.*;

public class third_max_54 {

    // -------------------------------------------------------
    // Problem
    // You are given an integer array nums.
    // You must return the third DISTINCT maximum number.
    
    // If the third distinct maximum does not exist,
    // return the maximum number instead.
    
    // Examples
    //  nums = [3,2,1]       -> 1
    //  nums = [1,2]         -> 2   (no 3rd max)
    //  nums = [2,2,3,1]     -> 1
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method = O(n) Scan for Top 3 Distinct Values
    
    // Idea
    //  -> Maintain three variables:
    //        first  = largest
    //        second = second largest
    //        third  = third largest
    
    //  -> For each number:
    //        - skip duplicates
    //        - update first, second, third accordingly
    
    //  -> If third is never assigned -> return first
    
    // Time Complexity  = O(n)
    // Space Complexity = O(1)
    // -------------------------------------------------------
    public static int third_max(int[] nums) {

        Long first = null;
        Long second = null;
        Long third = null;

        for (int num : nums) {

            long n = num;

            // Skip duplicates
            if ((first != null && n == first) ||
                (second != null && n == second) ||
                (third != null && n == third)) {
                continue;
            }

            // Update maxima
            if (first == null || n > first) {
                third = second;
                second = first;
                first = n;
            }
            else if (second == null || n > second) {
                third = second;
                second = n;
            }
            else if (third == null || n > third) {
                third = n;
            }
        }

        // Return third maximum if exists, else the largest
        return (third == null) ? first.intValue() : third.intValue();
    }

    // MAIN method
    public static void main(String[] args) {

        int[] nums1 = {3, 2, 1};          // output = 1
        int[] nums2 = {1, 2};             // output = 2
        int[] nums3 = {2, 2, 3, 1};       // output = 1
        int[] nums4 = {5, 5, 5};          // output = 5

        int r1 = third_max(nums1);
        int r2 = third_max(nums2);
        int r3 = third_max(nums3);
        int r4 = third_max(nums4);

        System.out.println("Result 1 = " + r1);
        System.out.println("Result 2 = " + r2);
        System.out.println("Result 3 = " + r3);
        System.out.println("Result 4 = " + r4);
    }
}

/*
Output

Result 1 = 1
Result 2 = 2
Result 3 = 1
Result 4 = 5
*/
