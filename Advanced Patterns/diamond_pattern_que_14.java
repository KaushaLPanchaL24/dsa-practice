/**
 * This program prints a diamond pattern using asterisks (*).
 * It consists of an upper and lower half to form a symmetrical diamond.
 *
 * Example (if user enters n = 5):
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 */

// import Scanner class
import java.util.Scanner;

public class diamond_pattern_que_14 {

    public static void main(String[] args) {

        // create scanner object
        Scanner sc = new Scanner(System.in);

        // ask user for input
        System.out.print("Enter the number of lines for the diamond pattern : ");
        int number_of_lines = sc.nextInt(); // you can take 'n' as a variable instead of 'number_of_lines' 

        // upper half of diamond [ excluding the middle line ]
        for (int i = 1; i < number_of_lines; i++) {  

            // print spaces before stars
            for (int j = 1; j <= number_of_lines - i; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // move to next line
            System.out.println();
        }

        // lower half of diamond [ includes middle line ]
        for (int i = number_of_lines; i >= 1; i--) {

            // print spaces before stars
            for (int j = 1; j <= number_of_lines - i; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // move to next line
            System.out.println();
        }

        // close the scanner
        sc.close();
    }
}
