import java.util.*;

public class three_sum_problem_que_29 {

    // -------------------------------------------------------
    // Method 1 = Brute Force ( Unoptimized ) Approach
    
    // Time Complexity = O(n³)
    // --> Uses three nested loops to check all possible triplets.
    // --> For each element, we compare with every pair that comes after it.
    
    // Space Complexity = O(n)
    // --> We use a HashSet to store unique triplets before adding them to the final list.
    // --> Avoids duplicate combinations but adds extra memory usage.
	
    // -------------------------------------------------------
	
    public static List<List<Integer>> three_sum_bruteforce(int[] nums) {
	
        int n = nums.length;
        Arrays.sort(nums); // sorting helps maintain order in triplets
        Set<List<Integer>> unique_triplets = new HashSet<>(); // avoid duplicates

        // check all combinations of three numbers
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        unique_triplets.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }

        // Convert set to list and return
        return new ArrayList<>(unique_triplets);
    }

    // -------------------------------------------------------
    // Method 2 = Optimized Two-Pointer Approach
    
    // Time Complexity = O(n²)
    // --> After sorting, we fix one number and use two pointers to find pairs that sum to -nums[i].
    // --> This reduces one loop, improving efficiency.
    
    // Space Complexity = O(1)
    // --> No extra data structures are used (apart from output list).
    // --> Works in-place after sorting.
    // -------------------------------------------------------
	
    public static List<List<Integer>> three_sum_optimized(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicate values

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // Skip duplicates
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } 
				else if (sum < 0) {
                    left++;
                } 
				else {
                    right--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println("Input Array = " + Arrays.toString(nums));
        System.out.println("--------------------------------------------------\n");
        
        // call Method 1 ( Brute Force )
        List<List<Integer>> brute_force_result = three_sum_bruteforce(nums);

        // call Method 2 ( Optimized )
        List<List<Integer>> optimized_result = three_sum_optimized(nums);
        
        System.out.println("Sorted Array = " + Arrays.toString(nums));
        System.out.println("--------------------------------------------------\n");

		//display
        System.out.println("Brute Force ( Unoptimized ) Result : ");
        System.out.println(brute_force_result);

        System.out.println("--------------------------------------------------\n");

        //display
        System.out.println("Optimized Two-Pointer Result : ");
        System.out.println(optimized_result);
    }
}