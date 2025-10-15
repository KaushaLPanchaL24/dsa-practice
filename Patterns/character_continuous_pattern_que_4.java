/**
 * This program prints a continuous character pattern.
 * Characters increase across all lines without resetting to 'A'.
 *
 * Example:
 * If user enters 4, the output :
 * A
 * BC
 * DEF
 * GHIJ
 */

// import Scanner class 
import java.util.Scanner;

public class character_continuous_pattern_que_4 {

    public static void main(String[] args) {

        // create a Scanner object 
        Scanner sc = new Scanner(System.in);

        // ask the user for input
        System.out.print("Enter the number of lines for the pattern : ");
        int number_of_line = sc.nextInt();

        // declare 'ch' variable starting from 'A'
        char ch = 'A';

        // outer loop for number of lines
        for (int i = 1; i <= number_of_line; i++) {    

            // inner loop prints characters for each line
            for (int j = 1; j <= i; j++) {      
                System.out.print(ch);
                ch++;       // move to next character
            }

            // move to the next line after printing numbers
            System.out.println();
        }

        // close the Scanner to free resources
        sc.close();  // good practice 
    }
}