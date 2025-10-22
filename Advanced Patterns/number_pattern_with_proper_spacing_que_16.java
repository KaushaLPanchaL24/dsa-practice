/**
 * This program prints a right-aligned number triangle pattern with increasing numbers.
 * Each row contains sequential numbers that increase row by row.
 * The numbers are aligned to form a right-angled triangle using tab spaces.
 * 
 * Example [ n = 5 ] :
 * 
 *               1
 *           2       3
 *       4       5       6
 *   7       8       9      10
 * 11     12     13     14     15
 */

// import Scanner class
import java.util.Scanner;

public class number_pattern_with_proper_spacing_que_16 {
    public static void main(String[] args) {
        
        // create Scanner object
        Scanner sc = new Scanner(System.in);

        // ask user for number of lines
        System.out.print("Enter the number of lines : ");
        int n = sc.nextInt();

        int k = 1;  // initialize number counter

        // loop through each row [ 1 to n ]
        for (int i = 1; i <= n; i++) {
            
            // print leading tabs for right alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print("\t");
            }

            // print increasing numbers with tab spacing
            for (int j = 1; j <= i; j++) {
                System.out.print(k + "\t\t");
                k++; // move to next number
            }

            // move to the next line
            System.out.println();
        }

        // close the Scanner to free resources 
        sc.close(); // good practice
    }
}
