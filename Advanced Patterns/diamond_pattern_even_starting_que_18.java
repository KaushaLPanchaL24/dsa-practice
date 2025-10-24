/**
 * This program prints a diamond pattern made of asterisks ( * ) 
 * where the upper part starts with an even number of stars.
 * 
 * The diamond is symmetric vertically, with the upper half 
 * having increasing even star counts and the lower half 
 * decreasing accordingly.
 * 
 * Example [ n = 5 ] :
 * 
 *      **
 *     ****
 *    ******
 *   ********
 *  **********
 *   ********
 *    ******
 *     ****
 *      **
 */

// import Scanner class
import java.util.Scanner;

public class diamond_pattern_even_starting_que_18 {
    public static void main(String[] args) {

        // create Scanner object
        Scanner sc = new Scanner(System.in);

        // ask user for number of lines [ for half of the diamond ]
        System.out.print("Enter the number of lines : ");
        int n = sc.nextInt();

        // upper part of the diamond
        for (int i = 1; i < n; i++) {

            // print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print stars (even number)
            for (int j = 1; j <= (2 * i); j++) {
                System.out.print("*");
            }

            // move to next line
            System.out.println();
        }

        // lower part of the diamond
        for (int i = n; i >= 1; i--) {

            // print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print stars (even number)
            for (int j = 1; j <= (2 * i); j++) {
                System.out.print("*");
            }

            // move to next line
            System.out.println();
        }

        // close Scanner
        sc.close(); // good practice
    }
}
