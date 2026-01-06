import java.util.*;

public class happy_number_61 {

    // -------------------------------------------------------
    // Problem
    // A number is called a HAPPY number if:
  
    //  -> Replace the number by the sum of the squares of its digits
    //  -> Repeat the process until:
    //       - The number becomes 1 (HAPPY), or
    //       - It enters a loop that does not include 1 (NOT HAPPY)
    
    // Return true if the number is happy, otherwise false.
    
    // -------------------------------------------------------
    // Examples
    //   n = 19
    //   1^2 + 9^2 = 82
    //   8^2 + 2^2 = 68
    //   6^2 + 8^2 = 100
    //   1^2 + 0^2 + 0^2 = 1  → HAPPY
    
    //   n = 2 → NOT HAPPY
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method = HashSet + Simulation
    
    // Idea
    //  -> Use a HashSet to keep track of numbers we have already seen
    //  -> If n becomes 1 → return true
    //  -> If n repeats (cycle detected) → return false
    
    // Time Complexity  = O(log n)
    // Space Complexity = O(log n)
    // -------------------------------------------------------
    public static boolean is_happy(int n) {

        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = get_sum_of_squares(n);
        }

        return n == 1;
    }

    // -------------------------------------------------------
    // Helper Method
    // Calculates the sum of the squares of digits of n
    // -------------------------------------------------------
    private static int get_sum_of_squares(int n) {

        int sum = 0;

        while (n > 0) {
            int digit = n % 10;       // extract last digit
            sum += digit * digit;     // add square
            n /= 10;                  // remove last digit
        }

        return sum;
    }

    // MAIN method
    public static void main(String[] args) {

        int n1 = 19;   // expected = true
        int n2 = 2;    // expected = false
        int n3 = 7;    // expected = true

        System.out.println("Result 1 = " + is_happy(n1));
        System.out.println("Result 2 = " + is_happy(n2));
        System.out.println("Result 3 = " + is_happy(n3));
    }
}

/*
Output

Result 1 = true
Result 2 = false
Result 3 = true
*/
