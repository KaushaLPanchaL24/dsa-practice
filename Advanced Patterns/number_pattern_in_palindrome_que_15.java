/**
 * This program prints a diamond-shaped palindrome number pattern.
 * Each row contains numbers increasing to a peak, then decreasing,
 * forming a symmetrical pyramid above and below.
 *
 * Example (if user enters n = 5) :
 *     1
 *    121
 *   12321
 *  1234321
 * 123454321
 *  1234321
 *   12321
 *    121
 *     1
 */

// import Scanner class
import java.util.Scanner;

public class PalindromeDiamond {

    public static void main(String[] args) {
	
		// create scanner object
        Scanner sc = new Scanner(System.in);

        // ask user for input
        System.out.print("Enter the number of lines for the palindrome diamond pattern : ");
        int n = sc.nextInt();

        // upper half of diamond [ excluding middle line ]
        for (int i = 1; i < n; i++) {

            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print increasing numbers
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }

            // print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // move to next line
            System.out.println();
        }

        // lower half of diamond [ includes middle line ]
        for (int i = n; i >= 1; i--) {

            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print increasing numbers
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }

            // print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // move to next line
            System.out.println();
        }
		// close the Scanner to free resources
        sc.close();		// good practice
    }
}
