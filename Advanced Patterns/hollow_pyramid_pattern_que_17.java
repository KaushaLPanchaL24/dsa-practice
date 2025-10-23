/**
 * This program prints a hollow pyramid pattern using asterisks (*).
 * The pyramid is centered using spaces, and only the borders of the pyramid 
 * are printed to form a hollow shape.
 * 
 * Example [ n = 5 ] :
 * 
 *         *
 *        * *
 *       *   *
 *      *     *
 *     * * * * *
 */

// import Scanner class
import java.util.Scanner;

public class hollow_pyramid_pattern_que_17 { // hollow pyramid
    public static void main(String[] args) {

        // create Scanner object
        Scanner sc = new Scanner(System.in);

        // ask user for number of lines
        System.out.print("Enter the number of lines : ");
        int n = sc.nextInt();

        // loop through each row [1 to n]
        for (int i = 1; i <= n; i++) {

            // print leading spaces for pyramid alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print stars and spaces for hollow pattern
            for (int j = 1; j <= (2 * i) - 1; j++) {
			
                // print '*' only for borders and base
                if (i == 1 || i == n || j == 1 || j == (2 * i) - 1) {
                    System.out.print("*");
                } 
				else {
                    System.out.print(" "); // inner hollow space
                }
            }

            // move to the next line
            System.out.println();
        }

        // close the Scanner to free resources
        sc.close(); // good practice
    }
}
