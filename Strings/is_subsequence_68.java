public class is_subsequence_68 {

    // -------------------------------------------------------
    // Problem
    // Given two strings s and t, determine if s is a
    // subsequence of t.
    
    // A subsequence is formed by deleting some (or none)
    // characters from t without changing the order.
    
    // Return true if s is a subsequence of t, else false.
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Examples
    // s = "abc", t = "ahbgdc" → true
    // s = "axc", t = "ahbgdc" → false
    // s = "",    t = "abc"    → true
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method = Two Pointers
    
    // Idea
    //  -> Use two pointers:
    //      sIndex -> tracks characters in s
    //      tIndex -> scans characters in t
    
    //  -> If characters match, move sIndex
    //  -> Always move tIndex
    
    // Why?
    //  -> We must keep the order of s intact
    
    // Time Complexity  = O(n)
    // Space Complexity = O(1)
    // -------------------------------------------------------
    public static boolean is_subsequence(String s, String t) {

        int sIndex = 0;
        int tIndex = 0;

        // traverse both strings
        while (sIndex < s.length() && tIndex < t.length()) {

            // if characters match, move pointer in s
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }

            // always move pointer in t
            tIndex++;
        }

        // if all characters in s were matched
        return sIndex == s.length();
    }

    // MAIN method
    public static void main(String[] args) {

        String s1 = "abc";
        String t1 = "ahbgdc";   // expected = true

        String s2 = "axc";
        String t2 = "ahbgdc";   // expected = false

        String s3 = "";
        String t3 = "abc";      // expected = true

        System.out.println("Result 1 = " + is_subsequence(s1, t1));
        System.out.println("Result 2 = " + is_subsequence(s2, t2));
        System.out.println("Result 3 = " + is_subsequence(s3, t3));
    }
}

/*
Output

Result 1 = true
Result 2 = false
Result 3 = true
*/
