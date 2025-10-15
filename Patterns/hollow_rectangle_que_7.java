/**
 * This program prints a hollow rectangle star pattern.
 * Stars are printed only on the borders — first/last rows and first/last columns.
 *
 * Example:
 * If user enters 4 rows and 5 columns, the output:
 * 
 *   *****
 *   *   *
 *   *   *
 *   *****
 */


// import Scanner class 
import java.util.Scanner;

public class hollow_rectangle_que_7 {

    public static void main(String[] args) {

        // create a Scanner object 
        Scanner sc = new Scanner(System.in);

        // ask the user for input
        System.out.print("Enter the number of row : ");
        int row = sc.nextInt();

        // ask the user for input
        System.out.print("Enter the number of column : ");
        int column = sc.nextInt();

       // outer loop for number of rows
        for (int i = 1; i <= row; i++) {    
           
            
            // inner loop for number of columns
            for (int j = 1; j <= column; j++) {    
                

                // print star if on border, else print space
                if(i == 1 || i == row || j == 1 || j == column){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }


            }

            // move to the next line after printing numbers
            System.out.println();
        }

        // close the Scanner to free resources
        sc.close();  // good practice 
    }
}