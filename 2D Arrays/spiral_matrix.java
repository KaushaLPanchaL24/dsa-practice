import java.util.*;

// Description = Create and Display a 2D Array (Matrix) in Spiral Order
// ----------------------------------------------------

public class SpiralMatrix {

    // Method to display the matrix in normal row-column form
    public static void displayMatrix(int[][] arr) {
        System.out.println("\nMatrix elements are : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to display the matrix in spiral order
    public static void displaySpiral(int[][] arr) {
        System.out.println("\nMatrix elements in Spiral Order : ");
        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;

        while (top <= bottom && left <= right) {

            // 1️⃣ Traverse from left → right
            for (int j = left; j <= right; j++) {
                System.out.print(arr[top][j] + " ");
            }
            top++;

            // 2️⃣ Traverse from top → bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // 3️⃣ Traverse from right → left (if still valid)
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(arr[bottom][j] + " ");
                }
                bottom--;
            }

            // 4️⃣ Traverse from bottom → top (if still valid)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
        System.out.println(); // for neat output
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ask user for matrix dimensions
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns : ");
        int cols = sc.nextInt();

        // create 2D array
        int[][] numbers = new int[rows][cols];

        // take user input for each element
        System.out.println("\nEnter elements of the matrix : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "] : ");
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("---------------------------------------");
        displayMatrix(numbers);

        System.out.println("---------------------------------------");
        displaySpiral(numbers);

        sc.close();
    }
}

/*
Example Output:

Enter number of rows : 3
Enter number of columns : 3

Enter elements of the matrix :
Element [0][0] : 1
Element [0][1] : 2
Element [0][2] : 3
Element [1][0] : 4
Element [1][1] : 5
Element [1][2] : 6
Element [2][0] : 7
Element [2][1] : 8
Element [2][2] : 9
---------------------------------------

Matrix elements are :
1 2 3
4 5 6
7 8 9
---------------------------------------

Matrix elements in Spiral Order :
1 2 3 6 9 8 7 4 5
*/
