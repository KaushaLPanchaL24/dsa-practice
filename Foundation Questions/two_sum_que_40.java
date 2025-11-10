import java.util.*;

public class two_sum_que_40 {

    // method 1 = Brute Force Approach [ O(n²) ]
    public static int[] brute_force(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    // method 2 = Optimized HashMap Approach [ O(n) ]
    public static int[] optimized_way(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }
        return new int[]{};
    }

    // Main Method 
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;

        int[] nums2 = {3, 2, 4};
        int target2 = 6;

        int[] nums3 = {3, 3};
        int target3 = 6;

        System.out.println("Input = " + Arrays.toString(nums1) + " | Target = " + target1);
        System.out.println("Brute Force Result = " + Arrays.toString(brute_force(nums1, target1)));
        System.out.println("Optimized Result =   " + Arrays.toString(optimized_way(nums1, target1)));
        System.out.println("--------------------------------------------------");

        System.out.println("Input = " + Arrays.toString(nums2) + " | Target = " + target2);
        System.out.println("Brute Force Result = " + Arrays.toString(brute_force(nums2, target2)));
        System.out.println("Optimized Result =   " + Arrays.toString(optimized_way(nums2, target2)));
        System.out.println("--------------------------------------------------");

        System.out.println("Input = " + Arrays.toString(nums3) + " | Target = " + target3);
        System.out.println("Brute Force Result = " + Arrays.toString(brute_force(nums3, target3)));
        System.out.println("Optimized Result =   " + Arrays.toString(optimized_way(nums3, target3)));
    }
}

/*
Output 

Input = [2, 7, 11, 15] | Target = 9
Brute Force Result = [0, 1]
Optimized Result =   [0, 1]
--------------------------------------------------
Input = [3, 2, 4] | Target = 6
Brute Force Result = [1, 2]
Optimized Result =   [1, 2]
--------------------------------------------------
Input = [3, 3] | Target = 6
Brute Force Result = [0, 1]
Optimized Result =   [0, 1]

*/
