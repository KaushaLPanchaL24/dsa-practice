/**
 * This program prints a left-aligned half pyramid number pattern.
 * Each row prints increasing numbers starting from 1 up to the line number.
 *
 * Example:
 * If user enters 5, the output :
 * 1
 * 12
 * 123
 * 1234
 * 12345
 */

// import Scanner class 
import java.util.Scanner;

public class half_pyramid_pattern_que_3 {

    public static void main(String[] args) {

        // create a Scanner object 
        Scanner sc = new Scanner(System.in);

        // ask the user for input
        System.out.print("Enter the number of lines for the pattern : ");
        int number_of_line = sc.nextInt();

        // outer loop for number of lines
        for (int line = 1; line <= number_of_line; line++) {

            // inner loop to print numbers from 1 up to the current line number
            for (int number = 1; number <= line; number++) {
                System.out.print(number);
            }

            // move to the next line after printing numbers
            System.out.println();
        }

        // close the Scanner to free resources
        sc.close();  // good practice 
    }
}
