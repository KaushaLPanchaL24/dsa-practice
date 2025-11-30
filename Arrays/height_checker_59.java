import java.util.*;

public class height_checker_59 {

    // -------------------------------------------------------
    // Problem
    // You are given an array heights[] representing the
    // current order of students standing in line.
    
    // Students are supposed to stand in NON-DECREASING order
    // of height.
    
    // expected[] = sorted version of heights[]
    
    // Return the number of positions i where:
    //      heights[i] != expected[i]
    
    // Examples =
    //   heights = [1,1,4,2,1,3]
    //   expected = [1,1,1,2,3,4]
    //   mismatches = 3
    
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method = Sorting + Comparison
    
    // Idea
    //  -> Create a copy of the heights array (expected)
    //  -> Sort expected → this is the correct lineup.
    //  -> Compare heights[i] with expected[i]
    //  -> Count mismatches
    
    // Time Complexity  = O(n log n)
    // Space Complexity = O(n)
    // -------------------------------------------------------
    public static int height_checker(int[] heights) {

        int n = heights.length;

        // create a copy of heights
        int[] expected = heights.clone();

        // sort to get the correct order
        Arrays.sort(expected);

        int count = 0;

        // compare original with sorted
        for (int i = 0; i < n; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
    }

    // MAIN method
    public static void main(String[] args) {

        int[] h1 = {1, 1, 4, 2, 1, 3};   // expected mismatches = 3
        int[] h2 = {5, 1, 2, 3, 4};      // expected mismatches = 5
        int[] h3 = {1, 2, 3, 4, 5};      // expected mismatches = 0

        System.out.println("Result 1 = " + height_checker(h1));
        System.out.println("Result 2 = " + height_checker(h2));
        System.out.println("Result 3 = " + height_checker(h3));
    }
}

/*
Output

Result 1 = 3
Result 2 = 5
Result 3 = 0
*/
