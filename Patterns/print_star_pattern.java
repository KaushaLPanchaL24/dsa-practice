/* This program prints a left-aligned triangle star pattern */


// import scanner class
import java.util.Scanner;

public class print_star_pattern {
    public static void main(String[] args){

        // make scanner object
        Scanner sc = new Scanner(System.in);

        // ask the user for input
        System.out.println("Enter the number of lines for the pattern : ");
        int number_of_line = sc.nextInt();

        // outer loop for number of lines
        for(int line = 1; line <= number_of_line; line++){

            // inner loop to print stars in each line
            for (int star = 1; star <= line; star++){
                System.out.print("*");
            }

            // move to the next line after printing stars
            System.out.println();
        }
    }
}
