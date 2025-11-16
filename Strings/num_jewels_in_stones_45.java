import java.util.*;

public class num_jewels_in_stones_45 {

    // -------------------------------------------------------
    // Problem
    // You are given:
    //  - String `jewels`  -> characters that are jewels
    //  - String `stones`  -> characters of stones you have
    //
    // Return the number of stones that are also jewels.
    //
    // Example:
    // jewels = "aA", stones = "aAAbbbb"
    // Output = 3
    // Explanation -> 'a', 'A', 'A' are jewels
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method = HashSet + Counting
    //
    // Idea
    // -> Put all jewel characters into a HashSet
    // -> Iterate through each stone
    // -> If the stone exists in the set, increase count
    //
    // Time Complexity  = O(n + m)
    //   ( n = length of jewels, m = length of stones )
    // Space Complexity = O(n)
    //   ( n = unique jewel characters )
    // -------------------------------------------------------
    public static int num_jewels_in_stones(String jewels, String stones) {

        HashSet<Character> set = new HashSet<>(); // store jewels

        // add each jewel to set
        for (char c : jewels.toCharArray()) {
            set.add(c);
        }

        int count = 0;

        // check stones
        for (char c : stones.toCharArray()) {
            if (set.contains(c)) {
                count++;
            }
        }

        return count; // return total jewels found
    }

    // MAIN method
    public static void main(String[] args) {

        String jewels_1 = "aA";
        String stones_1 = "aAAbbbb";

        String jewels_2 = "z";
        String stones_2 = "ZZ";

        String jewels_3 = "xyz";
        String stones_3 = "xxyyzzabc";

        System.out.println("Result 1 = " + num_jewels_in_stones(jewels_1, stones_1)); 
        System.out.println("Result 2 = " + num_jewels_in_stones(jewels_2, stones_2)); 
        System.out.println("Result 3 = " + num_jewels_in_stones(jewels_3, stones_3)); 
    }
}

/*
Expected Output

Result 1 = 3
Result 2 = 0
Result 3 = 6
*/
