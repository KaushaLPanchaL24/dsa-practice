import java.util.*;

public class valid_anagram_62 {

    // -------------------------------------------------------
    // Problem
    // Given two strings s and t,
    // return true if t is an anagram of s, and false otherwise.
    
    // An Anagram is a word formed by rearranging the letters
    // of another word using all original letters exactly once.
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Examples
    //   s = "anagram", t = "nagaram" → true
    //   s = "rat",     t = "car"     → false
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method = Sorting
    
    // Idea
    //  -> If lengths differ → cannot be anagrams
    //  -> Convert both strings to char arrays
    //  -> Sort both arrays
    //  -> Compare sorted arrays
    
    // Time Complexity  = O(n log n)
    // Space Complexity = O(n)
    // -------------------------------------------------------
    public static boolean isAnagram(String s, String t) {

        // If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        // Sort both arrays
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Compare sorted arrays
        return Arrays.equals(sArray, tArray);
    }

    // MAIN method
    public static void main(String[] args) {

        String s1 = "anagram";
        String t1 = "nagaram";   // expected = true

        String s2 = "rat";
        String t2 = "car";       // expected = false

        String s3 = "listen";
        String t3 = "silent";    // expected = true

        System.out.println("Result 1 = " + isAnagram(s1, t1));
        System.out.println("Result 2 = " + isAnagram(s2, t2));
        System.out.println("Result 3 = " + isAnagram(s3, t3));
    }
}

/*
Output

Result 1 = true
Result 2 = false
Result 3 = true
*/
