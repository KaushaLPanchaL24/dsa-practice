public class can_construct_69 {

    // -------------------------------------------------------
    // Problem
    // Given two strings ransom_note and magazine,
    // determine if ransom_note can be constructed
    // from the letters of magazine.
    
    // Each letter in magazine can only be used once.
    
    // Return true if possible, else false.
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Examples
    // ransom_note = "a",   magazine = "b"   -> false
    // ransom_note = "aa",  magazine = "ab"  -> false
    // ransom_note = "aa",  magazine = "aab" -> true
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method = Frequency Counting (Array)
    
    // Idea
    //  -> Use an array of size 26 to store character counts
    //  -> Count each letter in magazine
    //  -> For each letter in ransom_note:
    //      - If count is 0, cannot construct → return false
    //      - Otherwise, decrement the count
    
    // Why?
    //  -> Only lowercase letters ('a' to 'z')
    //  -> Array lookup is fast and memory efficient
    
    // Time Complexity  = O(n + m)
    // Space Complexity = O(1)
    // -------------------------------------------------------
    public static boolean can_construct(String ransom_note, String magazine) {

        int[] charCount = new int[26]; // store letter frequencies

        // count occurrences of each letter in magazine
        for (char c : magazine.toCharArray()) {
            charCount[c - 'a']++;
        }

        // check if ransom_note can be formed
        for (char c : ransom_note.toCharArray()) {
            if (charCount[c - 'a'] == 0) {
                return false; // letter not available
            }
            charCount[c - 'a']--; // use the letter
        }

        return true;
    }

    // MAIN method
    public static void main(String[] args) {

        String r1 = "a";
        String m1 = "b";     // expected = false

        String r2 = "aa";
        String m2 = "ab";    // expected = false

        String r3 = "aa";
        String m3 = "aab";   // expected = true

        System.out.println("Result 1 = " + can_construct(r1, m1));
        System.out.println("Result 2 = " + can_construct(r2, m2));
        System.out.println("Result 3 = " + can_construct(r3, m3));
    }
}

/*
Output

Result 1 = false
Result 2 = false
Result 3 = true
*/
