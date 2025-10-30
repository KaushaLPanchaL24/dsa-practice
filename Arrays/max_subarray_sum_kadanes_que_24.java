/**
 * This program finds the maximum subarray sum of a given integer array using Kadane's Algorithm.
 * 
 * A subarray is a contiguous part of the array.
 * Kadane's Algorithm efficiently finds the subarray with the largest sum in O(n) time.
 * 
 * Example
 * input n = 8
 * For the array [-2, -3, 4, -1, -2, 1, 5, -3] 
 * Answer --> The maximum subarray = 7
 */

// import Scanner class
import java.util.Scanner;

public class max_subarray_sum_kadanes_que_24 {

    // method to find the maximum subarray sum using Kadane's Algorithm
    public static int max_subarray_sum(int[] num) {
        int current_sum = num[0];
        int max_sum = num[0];

        // iterate through the array starting from index 1
        for (int i = 1; i < num.length; i++) {

            // either start a new subarray at num[i] or extend the existing one
            current_sum = Math.max(num[i], current_sum + num[i]);

            // update max_sum if current_sum is greater
            max_sum = Math.max(max_sum, current_sum);
        }

        return max_sum;
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

        // find and print the maximum subarray sum
        int max_sum = max_subarray_sum(num);
        System.out.println("\nMaximum subarray sum = " + max_sum);

        // close scanner
        sc.close(); // good practice
    }
}
