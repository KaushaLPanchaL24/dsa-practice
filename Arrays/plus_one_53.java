import java.util.*;

public class plus_one_53 {

    // -------------------------------------------------------
    // Problem
    // You are given a large integer represented as an array
    // of digits, where each element is a single digit.
    
    // The digits are arranged from most significant to least
    // significant (left to right). There are no leading zeros.
    
    // Task
    //  -> Add one to the integer.
    //  -> Return the resulting digits array.
    //  -> Must handle carry (e.g., 9 → 10).
    
    // Examples
    //  digits = [1,2,3]   -> [1,2,4]
    //  digits = [4,3,2,1] -> [4,3,2,2]
    //  digits = [9]       -> [1,0]
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method = Backward Traversal with Carry
    
    // Idea
    //  -> Start from the last digit (least significant).
    //  -> If the digit is less than 9, add 1 and return.
    //  -> If digit is 9, set to 0 and continue carry.
    //  -> If all digits are 9 (e.g., 999), create new array
    //     of size n+1 with leading 1.
    
    // Time Complexity  = O(n)
    // Space Complexity = O(1)  (except when new array needed)
    // -------------------------------------------------------
    public static int[] plus_one(int[] digits) {

        int n = digits.length;

        // Traverse digits from right to left
        for (int i = n - 1; i >= 0; i--) {

            if (digits[i] < 9) {   // normal increment
                digits[i]++;
                return digits;     // done, return quickly
            }

            digits[i] = 0;  // digit was 9, becomes 0
        }

        // If code reaches here, number was like 9, 99, 999...
        int[] result = new int[n + 1];
        result[0] = 1;  // e.g., 999 -> 1000

        return result;
    }

    // MAIN method
    public static void main(String[] args) {

        int[] d1 = {1, 2, 3};      // [1,2,4]
        int[] d2 = {4, 3, 2, 1};   // [4,3,2,2]
        int[] d3 = {9};            // [1,0]
        int[] d4 = {9,9,9};        // [1,0,0,0]

        int[] r1 = plus_one(d1);
        int[] r2 = plus_one(d2);
        int[] r3 = plus_one(d3);
        int[] r4 = plus_one(d4);

        System.out.println("Result 1 = " + Arrays.toString(r1));
        System.out.println("Result 2 = " + Arrays.toString(r2));
        System.out.println("Result 3 = " + Arrays.toString(r3));
        System.out.println("Result 4 = " + Arrays.toString(r4));
    }
}

/*
Output

Result 1 = [1, 2, 4]
Result 2 = [4, 3, 2, 2]
Result 3 = [1, 0]
Result 4 = [1, 0, 0, 0]
*/
