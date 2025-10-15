/**
 * This program prints a right-aligned triangle star pattern.
 *
 * Example:
 * If user enters 4, the output :
 *    *
 *   **
 *  ***
 * ****
 */

// import Scanner class 
import java.util.Scanner;

public class right_aligned_triangle_pattern_que_5 {

    public static void main(String[] args) {

        // create a Scanner object 
        Scanner sc = new Scanner(System.in);

        // ask the user for input
        System.out.print("Enter the number of lines for the pattern : ");
        int number_of_line = sc.nextInt();

        // outer loop for number of lines
        for (int i = 1; i <= number_of_line; i++) {    
           

            // 1st inner loop --> prints spaces before the stars to right-align the triangle
            for (int j = 1; j <= number_of_line - i; j++) {      
                System.out.print(" ");
            }

            // 2nd inner loop for --> prints stars for the current line
            for (int j = 1; j <= i; j++) {      
                System.out.print("*");
            }


            // move to the next line after printing numbers
            System.out.println();
        }

        // close the Scanner to free resources
        sc.close();  // good practice 
    }
}