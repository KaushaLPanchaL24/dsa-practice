public class find_error_nums_70 {

    // -------------------------------------------------------
    // Problem
    // Given an array nums containing numbers from 1 to n,
    // one number is duplicated and one number is missing.
    
    // Return an array [duplicate, missing].
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method = Frequency Counting (Array)
    
    // Idea
    //  -> Create a count array of size n + 1
    //  -> Count occurrences of each number
    //  -> Find:
    //      - count == 2 → duplicate
    //      - count == 0 → missing
    
    // Time Complexity  = O(n)
    // Space Complexity = O(n)
    // -------------------------------------------------------
    public static int[] find_error_nums(int[] nums) {

        int n = nums.length;
        int[] count = new int[n + 1];

        int duplicate = -1;
        int missing = -1;

        // count occurrences
        for (int num : nums) {
            count[num]++;
        }

        // identify duplicate and missing
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                duplicate = i;
            } else if (count[i] == 0) {
                missing = i;
            }
        }

        return new int[] { duplicate, missing };
    }

    // MAIN method
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 4};   // expected = [2, 3]
        int[] nums2 = {3, 1, 3};      // expected = [3, 2]

        int[] result1 = find_error_nums(nums1);
        int[] result2 = find_error_nums(nums2);

        System.out.println("Result 1 = [" + result1[0] + ", " + result1[1] + "]");
        System.out.println("Result 2 = [" + result2[0] + ", " + result2[1] + "]");
    }
}
