/**
 * This program prints a butterfly pattern made of asterisks (*).
 * The pattern has a top and bottom half, with spaces in the middle
 * forming the shape of a butterfly.
 *
 * example (if user enters 5):
 * *        *
 * **      **
 * ***    ***
 * ****  ****
 * **********
 * ****  ****
 * ***    ***
 * **      **
 * *        *
 */

import java.util.Scanner;

public class butterfly_pattern_que_11 {

    public static void main(String[] args) {

        // make scanner object
        Scanner sc = new Scanner(System.in);

        // ask the user for input
        System.out.println("enter the number of lines for the pattern: ");
        int number_of_line = sc.nextInt();

        // top half of butterfly
        for (int i = 1; i <= number_of_line; i++) {
            // print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // print spaces in the middle
            for (int j = 1; j <= 2 * (number_of_line - i); j++) {
                System.out.print(" ");
            }

            // print right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // move to the next line
            System.out.println();
        }

        // bottom half of butterfly
        for (int i = number_of_line; i >= 1; i--) {
            // print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // print spaces in the middle
            for (int j = 1; j <= 2 * (number_of_line - i); j++) {
                System.out.print(" ");
            }

            // print right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // move to the next line
            System.out.println();
        }

        // close the scanner to free resources
        sc.close(); 
    }
}
