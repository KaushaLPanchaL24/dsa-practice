import java.util.*;

public class remove_duplicates_52 {

    // -------------------------------------------------------
    // Problem
    // You are given a sorted integer array nums.
    // Remove the duplicates in-place so that each unique element
    // appears only once. The first k elements of nums should
    // contain the unique values in sorted order.
    
    // Task
    //  -> Return the number of unique elements k.
    //  -> Modify nums in-place so first k elements are unique.
    
    // Rules
    //  -> The array is sorted in non-decreasing order
    //  -> Must be done in-place without extra array
    //  -> Elements beyond index k - 1 do not matter
    
    // Examples
    //  nums = [1,1,2]                   -> k = 2, nums = [1,2,_]
    //  nums = [0,0,1,1,1,2,2,3,3,4]     -> k = 5, nums = [0,1,2,3,4,_,_,_,_,_]
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method = Two-Pointer Technique
    
    // Idea
    //  -> Since the array is sorted, duplicates are adjacent
    //  -> k keeps track of where next unique number goes
    //  -> Scan the array, copy only when nums[i] != nums[i-1]
    
    // Time Complexity  = O(n)
    // Space Complexity = O(1)
    // -------------------------------------------------------
    public static int remove_duplicates(int[] nums) {

        if (nums.length == 0)
            return 0;

        int k = 1;  // index where the next unique element will go

        // Traverse the array and collect unique elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {   // found a unique number
                nums[k] = nums[i];          // place it at index k
                k++;
            }
        }

        return k;  // number of unique elements
    }

    // MAIN method
    public static void main(String[] args) {

        int[] nums1 = {1, 1, 2};                         // [1,2,_], k = 2
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};             // [0,1,2,3,4,_,_,_,_,_], k = 5
        int[] nums3 = {5,5,5,5,5};                       // [5], k = 1

        int k1 = remove_duplicates(nums1);
        int k2 = remove_duplicates(nums2);
        int k3 = remove_duplicates(nums3);

        System.out.println("Result 1 = k = " + k1 + ", nums = " + Arrays.toString(nums1));
        System.out.println("Result 2 = k = " + k2 + ", nums = " + Arrays.toString(nums2));
        System.out.println("Result 3 = k = " + k3 + ", nums = " + Arrays.toString(nums3));
    }
}

/*
Output

Result 1 = k = 2, nums = [1, 2, 2]
Result 2 = k = 5, nums = [0, 1, 2, 3, 4, 2, 2, 3, 3, 4]
Result 3 = k = 1, nums = [5, 5, 5, 5, 5]
*/

/*
// another logic

public int remove_duplicates(int[] nums) {

    int slow = 0;  // position of last unique element

    for (int fast = 1; fast < nums.length; fast++) {
        if (nums[fast] != nums[slow]) {   // found a new unique element
            slow++;                       // move slow forward
            nums[slow] = nums[fast];      // write unique element
        }
    }

    return slow + 1;  // total unique elements
}

*/