/**
 * This program calculates the total amount of water that can be trapped 
 * between bars in an elevation map after raining using the Trapping Rainwater Algorithm.
 * 
 * The algorithm uses two auxiliary arrays to store the maximum height 
 * to the left and right of each bar and then calculates the trapped water.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * 
 * Example
 * Input n = 6
 * For the array [4, 2, 0, 3, 2, 5]
 * Answer --> The trapped water = 9
 */

// import Scanner class
import java.util.Scanner;

public class trapping_rainwater_que_25 {

    // method to calculate total trapped rainwater
    public static int trap(int[] height) {
        int n = height.length;

        // edge case
        if (n == 0) return 0;

        // calculate left max boundary
        int[] left_max_array = new int[n];
        left_max_array[0] = height[0];
        for (int i = 1; i < n; i++) {
            left_max_array[i] = Math.max(height[i], left_max_array[i - 1]);
        }

        // calculate right max boundary
        int[] right_max_array = new int[n];
        right_max_array[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right_max_array[i] = Math.max(height[i], right_max_array[i + 1]);
        }

        // calculate trapped water
        int trapped_water = 0;
        for (int i = 0; i < n; i++) {
            int water_level = Math.min(left_max_array[i], right_max_array[i]);
            trapped_water += water_level - height[i];
        }

        return trapped_water;
    }

    public static void main(String[] args) {

        // make scanner object
        Scanner sc = new Scanner(System.in);

        // ask user for number of bars
        System.out.print("Enter the number of bars (n) : ");
        int n = sc.nextInt();

        // create array
        int[] height = new int[n];

        // take input for array elements
        System.out.println("Enter the heights of bars : ");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        // find and print total trapped water
        int result = trap(height);
        System.out.println("\nTotal trapped water = " + result);

        // close scanner
        sc.close(); // good practice
    }
}


/*
Output : 

Enter the number of bars (n) : 7
Enter the heights of bars : 
4
2
0
6
3
2
5

Total trapped water = 11
*/