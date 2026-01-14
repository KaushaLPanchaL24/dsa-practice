public class detect_capital_67 {

    // -------------------------------------------------------
    // Problem
    // Given a word, determine if the usage of capitals
    // in the word is correct.
    
    // Correct capital usage means:
    //  1. All letters are uppercase -> "USA"
    //  2. All letters are lowercase -> "leetcode"
    //  3. Only the first letter is uppercase -> "Google"
    
    // Return true if correct, otherwise false.
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Examples
    // "USA"      → true
    // "leetcode" → true
    // "Google"   → true
    // "FlaG"     → false
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method
    
    // Idea
    //  -> Check three valid capital patterns:
    //     1. Entire word is uppercase
    //     2. Entire word is lowercase
    //     3. First letter uppercase & rest lowercase
    
    // Why?
    //  -> The problem only allows these three patterns
   
    // Time Complexity  = O(n)
    // Space Complexity = O(1)
    // -------------------------------------------------------
    public static boolean detect_capital_use(String word) {

        // Case 1 = All characters are uppercase
        if (word.equals(word.toUpperCase())) {
            return true;
        }

        // Case 2 = All characters are lowercase
        if (word.equals(word.toLowerCase())) {
            return true;
        }

        // Case 3 = First character uppercase, rest lowercase
        if (Character.isUpperCase(word.charAt(0)) &&
            word.substring(1).equals(word.substring(1).toLowerCase())) {
            return true;
        }

        // Any other pattern is invalid
        return false;
    }

    // MAIN method
    public static void main(String[] args) {

        String word1 = "USA";       // expected = true
        String word2 = "leetcode";  // expected = true
        String word3 = "Google";    // expected = true
        String word4 = "FlaG";      // expected = false

        System.out.println("Result 1 = " + detect_capital_use(word1));
        System.out.println("Result 2 = " + detect_capital_use(word2));
        System.out.println("Result 3 = " + detect_capital_use(word3));
        System.out.println("Result 4 = " + detect_capital_use(word4));
    }
}

/*
Output

Result 1 = true
Result 2 = true
Result 3 = true
Result 4 = false
*/
