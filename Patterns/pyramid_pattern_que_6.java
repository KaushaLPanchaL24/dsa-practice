/**
 * This program prints a pyramid pattern.
 *
 * Example:
 * If user enters 4, the output:
 *      *
 *     * *
 *    * * *
 *   * * * *
 */

 
 
/*
 * This code is almost identical to "right_aligned_triangle_pattern_que_5.java"
 * 
 *  -> Only one change was made to convert the right-aligned triangle into a pyramid : 
 *
 * In the second inner loop, change :
 *     System.out.print("*");
 * 
 * To :
 *     System.out.print("* ");  // added a space after '*'
 * 
 *  That extra space between stars creates proper spacing, which makes the pattern
 * appear as a centered pyramid instead of a right-aligned triangle.
 */



// import Scanner class 
import java.util.Scanner;

public class pyramid_pattern_que_6 {

    public static void main(String[] args) {

        // create a Scanner object 
        Scanner sc = new Scanner(System.in);

        // ask the user for input
        System.out.print("Enter the number of lines for the pattern : ");
        int number_of_line = sc.nextInt();

        // outer loop for number of lines
        for (int i = 1; i <= number_of_line; i++) {    
           

            // 1st inner loop --> prints spaces to center-align the pyramid
            for (int j = 1; j <= number_of_line - i; j++) {      
                System.out.print(" ");
            }

            // 2nd inner loop for --> prints stars with space to form pyramid
            for (int j = 1; j <= i; j++) {      
                System.out.print("* ");
            }


            // move to the next line after printing numbers
            System.out.println();
        }

        // close the Scanner to free resources
        sc.close();  // good practice 
    }
}