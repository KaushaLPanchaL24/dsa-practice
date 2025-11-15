import java.util.*;

public class find_words_containing_char_45 {

    // -------------------------------------------------------
    // Problem
    // You are given an array of strings `words` and a 
    // character `x`.
    
    // Return a list of indices of all words that contain
    // the character `x`.
    
    // Example
	// words = ["dog", "cat", "fish"], x = 't'
	// Output = [1]
	// Explanation -> 't' appears only in "cat"
    
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method = Linear Scan + Character Check
    
    // Idea
    // -> Iterate through the array
    // -> For each word, check if it contains char x
    // -> If yes, add the index to result list
    
    // Time Complexity  = O(n * m) 
    //   ( n = number of words, m = length of each word )
    // Space Complexity = O(k)
    //   ( k = number of matching indices )
    // -------------------------------------------------------
    public static List<Integer> find_words_containing(String[] words, char x) {

        List<Integer> result = new ArrayList<>();  // list of indices

        // iterate through words
        for (int i = 0; i < words.length; i++) {

            // check if the character x is present in the word
            if (words[i].indexOf(x) != -1) {
                result.add(i);   // add index to result
            }
        }

        return result;   // return the list
    }

    // MAIN method
	public static void main(String[] args) {

		String[] words_1 = {"hello", "world", "java", "code"};
		String[] words_2 = {"moon", "sun", "stars", "sky"};
		String[] words_3 = {"red", "green", "blue", "yellow"};

		System.out.println("Result 1 = " + find_words_containing(words_1, 'o'));

		System.out.println("Result 2 = " + find_words_containing(words_2, 's'));

		System.out.println("Result 3 = " + find_words_containing(words_3, 'z'));
		
	}
}

/*
Output

Result 1 = [0, 1, 3]
Result 2 = [1, 2, 3]
Result 3 = []

*/
