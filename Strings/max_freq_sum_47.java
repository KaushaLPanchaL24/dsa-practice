import java.util.*;

public class max_freq_sum_47 {

    // -------------------------------------------------------
    // Problem
    // You are given a string s consisting of lowercase letters.
    
    // Task
    //  - Find the vowel with the maximum frequency.
    //  - Find the consonant with the maximum frequency.
    //  - Return the sum of these two frequencies.
    
    // Example
    // s = "successes"
    // Vowels    -> 'u' (1), 'e' (2) => max vowel = 2
    // Consonants -> 's' (4), 'c' (2) => max consonant = 4
    // Answer = 2 + 4 = 6
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method = Frequency Counting
    
    // Idea
    // -> Count frequency of each character
    // -> Track highest vowel and highest consonant frequency
    
    // Time Complexity  = O(n + 26)
    // Space Complexity = O(1)
    // -------------------------------------------------------
    public static int max_freq_sum(String s) {

        int[] freq = new int[26]; // frequency array

        // count frequencies
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        String vowels = "aeiou";
        int max_vowel = 0;
        int max_consonant = 0;

        // check vowel and consonant frequencies
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);

            if (vowels.indexOf(ch) != -1) {  // vowel
                max_vowel = Math.max(max_vowel, freq[i]);
            } else {                         // consonant
                max_consonant = Math.max(max_consonant, freq[i]);
            }
        }

        return max_vowel + max_consonant; // required sum
    }

    // MAIN method
    public static void main(String[] args) {

        String s1 = "successes";     // expected 6
        String s2 = "aeiaeia";       // expected 3
        String s3 = "bbbcccddd";     // vowels = 0, consonants = 3 → 3

        System.out.println("Result 1 = " + max_freq_sum(s1));
        System.out.println("Result 2 = " + max_freq_sum(s2));
        System.out.println("Result 3 = " + max_freq_sum(s3));
    }
}

/*
Output

Result 1 = 6
Result 2 = 3
Result 3 = 3
*/
