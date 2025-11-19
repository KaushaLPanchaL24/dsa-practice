import java.util.*;

public class isomorphic_strings_48 {

    // -------------------------------------------------------
    // Problem
    // You are given two strings s and t.
    
    // Task
    //  - Determine if s and t are isomorphic.
    
    // Rules
    //  - Each character in s must map to exactly one character in t.
    //  - No two characters in s may map to the same character in t.
    //  - Characters may map to themselves.
    
    // Examples
    //  s = "egg", t = "add"   -> true
    //  s = "foo", t = "bar"   -> false
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method: Character Mapping
    
    // Idea
    //  -> Use two arrays of size 256 (ASCII)
    //  -> mapST[c] = mapped character in t
    //  -> mapTS[c] = reverse mapping in s
    //  -> Check consistency for every pair
    
    // Time Complexity  = O(n)
    // Space Complexity = O(1)  (constant array size 256)
    // -------------------------------------------------------
    public static boolean is_isomorphic(String s, String t) {

        if (s.length() != t.length()) 
            return false;

        int[] mapST = new int[256];  // mapping s -> t
        int[] mapTS = new int[256];  // mapping t -> s

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);   // from s
            char c2 = t.charAt(i);   // from t

            // If both not mapped yet → create new mapping
            if (mapST[c1] == 0 && mapTS[c2] == 0) {
                mapST[c1] = c2;
                mapTS[c2] = c1;
            } 
            // Already mapped → must match existing mapping
            else {
                if (mapST[c1] != c2 || mapTS[c2] != c1) {
                    return false;
                }
            }
        }

        return true;
    }

    // MAIN method
    public static void main(String[] args) {

        String s1 = "egg",   t1 = "add";    // true
        String s2 = "foo",   t2 = "bar";    // false
        String s3 = "paper", t3 = "title";  // true

        System.out.println("Result 1 = " + is_isomorphic(s1, t1));
        System.out.println("Result 2 = " + is_isomorphic(s2, t2));
        System.out.println("Result 3 = " + is_isomorphic(s3, t3));
    }
}

/*
Expected Output:

Result 1 = true
Result 2 = false
Result 3 = true
*/
