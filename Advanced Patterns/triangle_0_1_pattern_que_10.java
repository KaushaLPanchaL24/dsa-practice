/**
 * This program prints a 0-1 Triangle pattern.
 * Each row contains alternating 0s and 1s based on the position.
 * The value is determined by (row + column) % 2.
 *
 * Example:
 * If user enters 5, the output:
 * 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 * 1 0 1 0 1
 */

// import Scanner class
import java.util.Scanner;

public class triangle_0_1_pattern_que_10 {
    public static void main(String[] args) {

        // make scanner object
        Scanner sc = new Scanner(System.in);

        // ask the user for input
        System.out.println("Enter the number of lines for the pattern : ");
        int number_of_line = sc.nextInt();

        // outer loop for number of lines
        for (int i = 1; i <= number_of_line; i++) {

            // inner loop to print 1 or 0 in each line
            for (int j = 1; j <= i; j++) {

                // logic = print 1 if (i + j) is even, else print 0
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }

            // move to the next line after each row
            System.out.println();
        }

        // close the Scanner to free resources
        sc.close(); // good practice
    }
}
