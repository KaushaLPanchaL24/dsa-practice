/**
 * This program prints Floyd's Triangle pattern.
 * Numbers increase consecutively across the triangle rows.
 *
 * Example:
 * If user enters 5, the output:
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 */

// import scanner class
import java.util.Scanner;

public class FLOYDS_Triangle_que_9 {
    public static void main(String[] args){

        // make scanner object
        Scanner sc = new Scanner(System.in);

        // ask the user for input
        System.out.println("Enter the number of lines for the pattern : ");
        int number_of_line = sc.nextInt();

        // starting number to print
        int num = 1;

        // outer loop for number of lines
        for(int line = 1; line <= number_of_line; line++){
            
            // inner loop to print numbers in each line
            for (int count = 1; count <= line; count++){
                System.out.print(num + " ");
                num++;
            }

            // move to the next line after printing numbers
            System.out.println();
        }
        // close the Scanner to free resources
        sc.close(); // good practice 
    }
}
