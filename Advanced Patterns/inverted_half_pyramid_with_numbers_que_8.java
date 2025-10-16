/**
 * This program prints an inverted half-pyramid number pattern.
 * The number of digits decreases in each row from left to right.
 *
 * Example:
 * If user enters 5, the output:
 * 12345
 * 1234
 * 123
 * 12
 * 1
 */

// import Scanner class 
import java.util.Scanner;

public class inverted_half_pyramid_with_numbers_que_8 {

    public static void main(String[] args) {

        // create a Scanner object 
        Scanner sc = new Scanner(System.in);

        // ask the user for input
        System.out.print("Enter the number of lines for the pattern : ");
        int number_of_line = sc.nextInt();

        // outer loop for number of lines ( rows )
        for (int i = 1; i <= number_of_line; i++) {

            // inner loop prints increasing numbers from 1 to (number_of_line - i + 1)
            for (int j = 1; j <= number_of_line - i + 1; j++) {
                System.out.print(j);
            }

            // move to the next line after printing numbers
            System.out.println();
        }

        // close the Scanner to free resources
        sc.close(); // good practice 
    }
}
