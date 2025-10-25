/**
 * This program prints a number pyramid pattern.
 * 
 * Each row starts with the number 1 and increases sequentially 
 * up to the row number. The pyramid is right-aligned by adding 
 * appropriate tab spaces before the numbers.
 * 
 * Example [ n = 5 ] :
 * 
 *          1
 *        1   2
 *      1   2   3
 *    1   2   3   4
 *  1   2   3   4   5
 */

// import Scanner class
import java.util.Scanner;

public class number_pyramid_que_19 {
    public static void main(String[] args) {

        // create Scanner object
        Scanner sc = new Scanner(System.in);

        // ask user for number of lines
        System.out.print("Enter the number of lines : ");
        int n = sc.nextInt();

        // print number pyramid
        for (int i = 1; i <= n; i++) {

            // print leading spaces (for right alignment)
            for (int j = 1; j <= n - i; j++) {
                System.out.print("\t");
            }

            // print increasing numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t\t");
            }

            // move to next line
            System.out.println();
        }

        // close Scanner
        sc.close(); // good practice
    }
}
