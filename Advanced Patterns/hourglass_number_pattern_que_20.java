/**
 * This program prints an hourglass number pattern.
 * The pattern first decreases in width until the center,
 * then increases back to form a symmetric hourglass shape.
 *
 * Example [ if user enters 5 ] 
 * 1 2 3 4 5 4 3 2 1
 *   1 2 3 4 3 2 1
 *     1 2 3 2 1
 *       1 2 1
 *         1
 *       1 2 1
 *     1 2 3 2 1
 *   1 2 3 4 3 2 1
 * 1 2 3 4 5 4 3 2 1
 */

// import Scanner class
import java.util.Scanner;

public class hourglass_number_pattern_que_20 {

    public static void main(String[] args) {

        // make scanner object
        Scanner sc = new Scanner(System.in);

        // ask the user for input
        System.out.println("enter the number of lines for the pattern : ");
        int number_of_lines = sc.nextInt();

        // top half of the hourglass [ including middle line ]
        for (int i = 0; i < number_of_lines; i++) {

            // print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print("  "); // two spaces for alignment
            }

            // print increasing numbers
            for (int j = 1; j <= number_of_lines - i; j++) {
                System.out.print(j + " ");
            }

            // print decreasing numbers
            for (int j = number_of_lines - i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // move to next line
            System.out.println();
        }

        // bottom half of the hourglass
        for (int i = number_of_lines - 2; i >= 0; i--) {

            // print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            // print increasing numbers
            for (int j = 1; j <= number_of_lines - i; j++) {
                System.out.print(j + " ");
            }

            // print decreasing numbers
            for (int j = number_of_lines - i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // move to next line
            System.out.println();
        }

        // close the scanner to free resources
        sc.close();	// good practice
    }
}