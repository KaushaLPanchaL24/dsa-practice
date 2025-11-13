import java.util.*;

public class largest_string_in_array_que_43 {

    // -------------------------------------------------------
    // Problem
    // Given an array of strings, find and print the lexicographically largest string.
    
    // Example
    // Input  = {"apple", "banana", "mango"}
    // Output = "mango"
    
    // Explanation
    // In dictionary order = apple < banana < mango
    // So, "mango" is the largest.
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Approach
    
    // -> Initialize the first string as the largest.
    // -> Traverse the array from index 1 to end.
    // -> Compare each string using compareTo():
    //       -> If current string is greater, update largest.
    
    // Time Complexity  = O(n)
    // Space Complexity = O(1)
    // -------------------------------------------------------
    public static void main(String[] args) {

        // declare and initialize the string array
        String[] fruits = {"apple", "banana", "mango"};

        // assume the first element is the largest
        String largest = fruits[0];

        // loop through the array starting from index 1
        for (int i = 1; i < fruits.length; i++) {

            // compare current fruit with current largest
            // compareTo() returns
            //   > 0  -> first string is lexicographically larger
            //   < 0  -> first string is smaller
            //   = 0  -> both are equal
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i]; // update largest
            }
        }

        System.out.println("Lexicographically largest string = " + largest);
    }
}

/*
Output

Lexicographically largest string = mango

*/
