/*
 * This program prints an inverted left-aligned triangle star pattern
 * based on the number of lines entered by the user.
 */

// import scanner class
import java.util.Scanner;

public class inverted_star_pattern_que_2 {
     public static void main(String[] args){
       
        // make scanner object
        Scanner sc = new Scanner(System.in);

        // ask the user for input
        System.out.println("Enter the number of lines for the inverted star pattern : ");
        int number_of_line = sc.nextInt();

         // outer loop for number of lines
        for(int line = 1; line <= number_of_line; line++){

            // inner loop prints decreasing number of stars on each line
            // line 1 = print number_of_line stars
            // line 2 = print [ number_of_line - 1 ] stars, and etc..
            
            for (int star = 1; star <= number_of_line - line + 1; star++){
                System.out.print("*");
            }

            // move to the next line after printing stars
            System.out.println();
        }
     }
}
