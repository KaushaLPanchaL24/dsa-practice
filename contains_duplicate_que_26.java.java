// Importing HashSet ( needed for optimized version )
import java.util.HashSet;

public class contains_duplicate_que_26 {
    
    // method 1 : Normal ( unoptimized ) way to check duplicates
    public static boolean check_unique_normal_way(int[] nums) {
        // compare every element with every other element
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // start from i+1 to avoid comparing same element
                if (nums[i] == nums[j]) {
                    // if any two elements are the same,return true ( duplicate found )
                    return true;
                }
            }
        }
        // if loop finishes,no duplicates were found
        return false;
    }

    /*
    explanation :
    -> We use two loops= for every element, we check all elements that come after it.
    -> If any pair is equal → it means there is a duplicate.

    time complexity : O(n²)
       -> means if there are 100,000 numbers, it could take about 10 billion comparisons...
       → So it’s too slow for large arrays.

    space complexity: O(1)
       -> No extra memory used.
    */


    // method 2 : Optimized way to check duplicates using HashSet
    
    public static boolean optimized_way_check_unique(int[] nums) {
        // create a HashSet to store numbers we have already seen
        HashSet<Integer> numbers = new HashSet<>();

        // loop through each number in the array
        for (int num : nums) {
            // if number is already in the set, it means it's a duplicate
            if (numbers.contains(num)) {
                return true; // Duplicate found
            }
            // otherwise, add this number to the set
            numbers.add(num);
        }

        // no duplicates found
        return false;
    }

    /*
    explanation
    -> HashSet only stores unique values.
    -> for each number :
         -->If it's already in the set, it means we've seen it before → duplicate found.
         --> otherwise, we add it to the set and continue.

    time cmplexity : O(n)
       -> each lookup and insertion in a HashSet is very fast (on average O(1)).
       -> so this runs efficiently even for large arrays.

    space complexity : O(n)
       -> We may store up to all elements in the HashSet.
    */


    // Main Method
    public static void main(String[] args) {
        // example input array
        int[] nums = {1, 2, 3, 4};
        int[] nums_2 = {1, 2, 3, 4, 2};
        
        // calling both methods
        boolean answer = check_unique_normal_way(nums);
        boolean another_answer = optimized_way_check_unique(nums_2);

        // displaying results from both methods ( method : 1 )
        if (answer) {
            System.out.println("Every element is not unique..... (Normal way)");
        } 
        else {
            System.out.println("Elements are distinct..... (Normal way)");
        }

        // displaying results from both methods ( method : 2 )
        if (another_answer) {
            System.out.println("Every element is not unique..... (Optimized way)");
        } else {
            System.out.println("Elements are distinct..... (Optimized way)");
        }
    }
}
