import java.util.*;

// Description = Create and Display a 2D Array (Matrix)

// This program demonstrates how to :
// --> Take user input for a 2D array (matrix).
// --> Store the input values in a 2D array structure.
// --> Display the array elements in matrix form.

// ----------------------------------------------------

public class two_d_array_creation {

    public static void display(int[][] arr) {
        System.out.println("\nMatrix elements are : ");
        for (int i = 0; i < arr.length; i++) { // iterate through rows
            for (int j = 0; j < arr[i].length; j++) { // iterate through columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // move to next line after each row
        }
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

        // display the matrix
        System.out.println("---------------------------------------");
        display(numbers);

        sc.close();
    }
}

/*
Output

Enter number of rows : 2
Enter number of columns : 3

Enter elements of the matrix : 
Element [0][0] : 1
Element [0][1] : 2
Element [0][2] : 3
Element [1][0] : 9
Element [1][1] : 8
Element [1][2] : 7
---------------------------------------

Matrix elements are : 
1 2 3 
9 8 7 

*/
