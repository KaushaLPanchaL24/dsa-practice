import java.util.*;

public class string_palindrome_que_42 {

    // -------------------------------------------------------
    // Problem
    // Check if a given string is a palindrome.
    
    // A palindrome is a word, phrase, or sequence that reads
    // the same backward as forward.
    
    // Example
    // Input  : "madam"
    // Output : true
    
    // Input  : "abc"
    // Output : false
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method = Two-Pointer Approach
    
    // Idea
    // 1. Use two indices — one starting from the beginning,
    //    another from the end of the string.
    // 2. Compare characters at these positions.
    // 3. If all pairs match, it’s a palindrome.
    
    // Time Complexity  = O(n)
    // Space Complexity = O(1)
    // -------------------------------------------------------
	
    public static boolean is_string_palindrome(String str) {

        // step 1 = get the length of the string
        int n = str.length();

        // step 2 = loop from start to middle of the string
        for (int i = 0; i < n / 2; i++) {

            // step 3 = Compare characters from both ends
            // str.charAt(i)         -> character from start
            // str.charAt(n - i - 1) -> character from end
            if (str.charAt(i) != str.charAt(n - i - 1)) {

                // if mismatch occurs, it's not a palindrome
                return false;
            }
        }

        // step 4 = if no mismatch found, it's a palindrome
        return true;
    }

    // MAIN Method 
    public static void main(String[] args) {

        // Variable Declarations
        String input1 = "abc";      // Not a palindrome
        String input2 = "madam";    // Palindrome
        String input3 = "racecar";  // Palindrome

        // Printing results
        System.out.println("Is '" + input1 + "' a palindrome ? -> " + is_string_palindrome(input1));
        System.out.println("Is '" + input2 + "' a palindrome ? -> " + is_string_palindrome(input2));
        System.out.println("Is '" + input3 + "' a palindrome ? -> " + is_string_palindrome(input3));
    }
}

/*
Output

Is 'abc' a palindrome ? -> false
Is 'madam' a palindrome ? -> true
Is 'racecar' a palindrome ? -> true

*/
