/**
 * This program prints all possible pairs in a given array.
 * 
 * For an array [2, 4, 6, 8, 10], the output will be:
 * (2,4)(2,6)(2,8)(2,10)
 * (4,6)(4,8)(4,10)
 * (6,8)(6,10)
 * (8,10)
 * 
 * Each element forms pairs with all elements that come after it.
 */

// import Scanner class
import java.util.Scanner;

public class pairs_in_array_que_21 {

    // method to print all pairs from the array
    public static void print_pairs(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + num[i] + "," + num[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // make scanner object
        Scanner sc = new Scanner(System.in);

        // ask user for number of elements
        System.out.print("Enter the number of elements in the array : ");
        int n = sc.nextInt();

        // create array
        int[] num = new int[n];

        // take input for array elements
        System.out.println("Enter " + n + " elements :");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        // print pairs
        System.out.println("\nAll pairs :");
        print_pairs(num);

        // close scanner
        sc.close();
    }
}
