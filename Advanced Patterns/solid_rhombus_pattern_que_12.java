/**
 * This program prints a Solid Rhombus pattern.
 * Each row contains the same number of stars, but shifted right to form a rhombus.
 *
 * Example:
 * If user enters 5, the output:
 *     *****
 *    *****
 *   *****
 *  *****
 * *****
 */

// import Scanner class
import java.util.Scanner;

public class solid_rhombus_pattern_que_12 {
    public static void main(String[] args) {

        // create Scanner object
        Scanner sc = new Scanner(System.in);

        // ask the user for input
        System.out.println("Enter the number of rows for the rhombus : ");
        int n = sc.nextInt();

        // outer loop for number of lines
        for (int i = 1; i <= n; i++) {

            // print leading spaces to shift stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print stars in each row , n times
            for (int j = 1; j <= n; j++) { 
                System.out.print("*");
            }

            // move to next line
            System.out.println();
        }

        // close the Scanner to free resources
        sc.close(); // good practice
    }
}
