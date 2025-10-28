/**
 * This program prints all possible subarrays of a given integer array.
 * 
 * A subarray is a contiguous part of the array.
 * For example, for the array [2, 4, 6]:
 * The subarrays are:
 * [2]
 * [2, 4]
 * [2, 4, 6]
 * [4]
 * [4, 6]
 * [6]
 */

// import Scanner class
import java.util.Scanner;

public class print_subarrays_que_22 {

    // method to print all subarrays of the array
    public static void print_subarrays(int[] num) {
        int n = num.length;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {

                // print elements from index start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(num[k] + " ");
                }
                System.out.println(); // new line after each subarray
            }
            System.out.println(); // blank line between groups
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

        // print all subarrays
        System.out.println("\nAll possible subarrays :");
        print_subarrays(num);

        // close scanner
        sc.close(); // good practice
    }
}
