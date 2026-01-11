public class convert_to_base7_65 {

    // -------------------------------------------------------
    // Problem
    // Given an integer num, return a string representing
    // its base 7 representation.
    
    // Base 7 uses digits: 0, 1, 2, 3, 4, 5, 6
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Examples
    // num = 100  → "202"
    // num = -7   → "-10"
    // num = 0    → "0"
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method = Math + StringBuilder
    
    // Idea
    //  -> Base conversion using repeated division
    //  -> Keep taking num % 7 to get digits
    //  -> Divide num by 7 until it becomes 0
    
    // Steps
    // 1. Handle edge case: num == 0
    // 2. Track if number is negative
    // 3. Convert absolute value to base 7
    // 4. Append '-' if original number was negative
    // 5. Reverse the result
    
    // Time Complexity  = O(log₇ n)
    // Space Complexity = O(log₇ n)
    // -------------------------------------------------------
    public static String convert_to_base_7(int num) {

        // Edge case
        if (num == 0) return "0";

        boolean is_negative = num < 0;
        num = Math.abs(num);

        StringBuilder sb = new StringBuilder();

        // convert to base 7
        while (num > 0) {
            sb.append(num % 7);
            num /= 7;
        }

        // add negative sign if needed
        if (is_negative) {
            sb.append("-");
        }

        // reverse to get correct order
        return sb.reverse().toString();
    }

    // MAIN method
    public static void main(String[] args) {

        int n1 = 100;   // expected = "202"
        int n2 = -7;    // expected = "-10"
        int n3 = 0;     // expected = "0"
        int n4 = 7;     // expected = "10"

        System.out.println("Result 1 = " + convert_to_base_7(n1));
        System.out.println("Result 2 = " + convert_to_base_7(n2));
        System.out.println("Result 3 = " + convert_to_base_7(n3));
        System.out.println("Result 4 = " + convert_to_base_7(n4));
    }
}

/*
Output

Result 1 = 202
Result 2 = -10
Result 3 = 0
Result 4 = 10
*/
