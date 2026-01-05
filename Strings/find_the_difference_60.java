import java.util.*;

public class find_the_difference_60 {

    // -------------------------------------------------------
    // Problem
    // You are given two strings:
    //   s → original string
    //   t → string formed by shuffling s and adding ONE extra character
    //
    // Task:
    //   Find and return the extra character in t.
    //
    // -------------------------------------------------------
    // Example
    //   s = "abcd"
    //   t = "abcde"
    //   Output = 'e'
    //
    //   s = ""
    //   t = "y"
    //   Output = 'y'
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method = ASCII Sum Difference
    //
    // Idea
    //  -> Calculate the sum of ASCII values of characters in s
    //  -> Calculate the sum of ASCII values of characters in t
    //  -> The difference (sumT - sumS) gives the extra character
    //
    // Time Complexity  = O(n)
    // Space Complexity = O(1)
    // -------------------------------------------------------
    public static char find_the_difference(String s, String t) {

        int sumS = 0;
        int sumT = 0;

        // sum ASCII values of characters in s
        for (int i = 0; i < s.length(); i++) {
            sumS += s.charAt(i);
        }

        // sum ASCII values of characters in t
        for (int i = 0; i < t.length(); i++) {
            sumT += t.charAt(i);
        }

        // the difference gives the extra character
        return (char) (sumT - sumS);
    }

    // MAIN method
    public static void main(String[] args) {

        String s1 = "abcd";
        String t1 = "abcde";   // expected = 'e'

        String s2 = "";
        String t2 = "y";       // expected = 'y'

        String s3 = "aabb";
        String t3 = "ababc";   // expected = 'c'

        System.out.println("Result 1 = " + find_the_difference(s1, t1));
        System.out.println("Result 2 = " + find_the_difference(s2, t2));
        System.out.println("Result 3 = " + find_the_difference(s3, t3));
    }
}

/*
Output

Result 1 = e
Result 2 = y
Result 3 = c
*/
