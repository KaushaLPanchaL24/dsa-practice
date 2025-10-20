/**
 * This program prints a Hollow Rhombus pattern using stars.
 * It shifts the pattern right using spaces and prints only the border.
 *
 * Example (n = 5):
 *     *****
 *    *   *
 *   *   *
 *  *   *
 * *****
 */

// import Scanner class
import java.util.Scanner;

public class hollow_rhombus_pattern_que_13 {
    public static void main(String[] args) {

        // create scanner object
        Scanner sc = new Scanner(System.in);

        // ask user for input
        System.out.print("Enter the number of rows for the hollow rhombus: ");
        int n = sc.nextInt();

        // outer loop for number of lines
        for (int i = 1; i <= n; i++) {

            // print leading spaces 
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print stars and spaces
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // move to the next line
            System.out.println();
        }

        // close the Scanner to free resources
        sc.close(); // good practice
    }
}
