/**
 * This program finds the maximum subarray sum of a given integer array using brute force.
 * 
 * A subarray is a contiguous part of the array.
 * The brute force method checks all possible subarrays and finds the one with the largest sum.
 * 
 * Example:
 * For the array [2, -4, 6, 8, -10, 100, -6, 5] :
 * The maximum subarray sum is 103
 */

// import Scanner class
import java.util.Scanner;

public class max_subarray_sum_bruteforce_que_23 {

    // method to find the maximum subarray sum using brute force
    public static int max_subarray_sum(int[] num) {
        int n = num.length;
        int maxSum = Integer.MIN_VALUE; // to store the maximum sum

        // iterate over all possible subarrays
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int currSum = 0;

                // calculate sum of subarray from start to end
                for (int k = start; k <= end; k++) {
                    currSum += num[k];
                }

                // update maxSum if current sum is greater
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        return maxSum;
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
        int maxSum = max_subarray_sum(num);
        System.out.println("\nMaximum subarray sum = " + maxSum);

        // close scanner
        sc.close(); // good practice
    }
}
