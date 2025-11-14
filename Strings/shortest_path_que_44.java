import java.util.*;

public class shortest_path_que_44 {

    // -------------------------------------------------------
    // Problem
    // Given a path string containing directions =
    // 'N' -> North (y++)
    // 'S' -> South (y--)
    // 'E' -> East  (x++)
    // 'W' -> West  (x--)
    
    // Return the *shortest distance* from the origin (0,0)
    // after following all the steps.
    
    // Example
    // Input  = "NS"
    // Output = 0.0
    
    // Explanation=
    // N moves up, S moves down → cancels → back to origin.
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method = Track Coordinates + Apply Distance Formula
    
    // Idea
    // -> Start at (0,0)
    // -> Move x,y according to each character
    // -> Final shortest distance = sqrt(x² + y²)
    
    // Time Complexity  : O(n)
    // Space Complexity : O(1)
    // -------------------------------------------------------
    public static float get_shortest_path(String path) {

        int x = 0;  // horizontal movement
        int y = 0;  // vertical movement

        // iterate through the path string
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if (dir == 'S') {
                y--;    // move south
            } 
			else if (dir == 'N') {
                y++;    // move north
            } 
			else if (dir == 'W') {
                x--;    // move west
            } 
			else if (dir == 'E') {
                x++;    // move east
            }
        }

        // distance formula: √(x² + y²)
        int X2 = x * x;
        int Y2 = y * y;

        return (float) Math.sqrt(X2 + Y2);
    }

    // MAIN method 
    public static void main(String[] args) {

        String path = "NS";  // test case
		String path_2 = "WNEENESENNN";

        System.out.println("Shortest Distance for ex 1 = " + get_shortest_path(path));
		System.out.println("Shortest Distance for ex 2 = " + get_shortest_path(path_2));

    }
}

/*
Output:

Shortest Distance for ex 1 = 0.0
Shortest Distance for ex 2 = 5.0

*/
