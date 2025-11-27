import java.util.*;

public class unique_morse_56 {

    // -------------------------------------------------------
    // Problem
    // You are given an array of words.
    // Each letter maps to a Morse code sequence.
    
    // A word's Morse transformation is the concatenation of
    // the Morse codes of each character.
    
    // Return the number of UNIQUE Morse transformations.
    
    // Examples
    //  words = ["gin","zen","gig","msg"] -> 2
    //  words = ["a"]                    -> 1
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method = Transform and Store in HashSet (O(n * k))
    
    // Idea
    //  -> Use predefined Morse code mapping for a–z.
    //  -> For each word:
    //         convert each letter to Morse code
    //         build the full transformation string
    //         store in a HashSet (duplicates auto removed)
    //
    // Time Complexity  = O(n * k)   (k = avg word length)
    // Space Complexity = O(n)
    // -------------------------------------------------------
    public static int unique_morse(String[] words) {

        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",
            ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-","-.--","--.."
        };

        HashSet<String> set = new HashSet<>();

        for (String word : words) {

            StringBuilder sb = new StringBuilder();

            // Convert word to Morse code
            for (char ch : word.toCharArray()) {
                sb.append(morse[ch - 'a']);
            }

            set.add(sb.toString());
        }

        return set.size();  // number of distinct transformations
    }

    // MAIN method
    public static void main(String[] args) {

        String[] w1 = {"gin", "zen", "gig", "msg"};   // output = 2
        String[] w2 = {"a"};                          // output = 1
        String[] w3 = {"no", "on"};                   // different

        int r1 = unique_morse(w1);
        int r2 = unique_morse(w2);
        int r3 = unique_morse(w3);

        System.out.println("Result 1 = " + r1);
        System.out.println("Result 2 = " + r2);
        System.out.println("Result 3 = " + r3);
    }
}

/*
Output

Result 1 = 2
Result 2 = 1
Result 3 = 2
*/
