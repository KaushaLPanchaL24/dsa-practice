public class arranging_coins_64 {

    // -------------------------------------------------------
    // Problem
    // You have n coins and you want to build a staircase
    // with these coins.
    
    // The staircase consists of k rows:
    //  - The 1st row has 1 coin
    //  - The 2nd row has 2 coins
    //  - The 3rd row has 3 coins
    //  - ...
    
    // Given n, return the number of complete rows
    // that can be formed.
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Examples
    // n = 5  → 2
    // n = 8  → 3
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method = Binary Search
    
    // Idea
    //  -> We want the maximum k such that:
    //       k * (k + 1) / 2 <= n
    
    //  -> Search range:
    //       left  = 0
    //       right = n
    
    //  -> Use long to prevent overflow
    
    // Time Complexity  = O(log n)
    // Space Complexity = O(1)
    // -------------------------------------------------------
    public static int arrange_coins(int n) {

        long left = 0;
        long right = n;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            // Coins needed to build mid rows
            long coins_used = mid * (mid + 1) / 2;

            if (coins_used == n) {
                return (int) mid;
            }
			else if (coins_used < n) {
                left = mid + 1;
            }
			else {
                right = mid - 1;
            }
        }

        // Right will be the largest k such that
        // k * (k + 1) / 2 <= n
        return (int) right;
    }

    // MAIN method
    public static void main(String[] args) {

        int n1 = 5;   // expected = 2
        int n2 = 8;   // expected = 3
        int n3 = 1;   // expected = 1
        int n4 = 0;   // expected = 0

        System.out.println("Result 1 = " + arrange_coins(n1));
        System.out.println("Result 2 = " + arrange_coins(n2));
        System.out.println("Result 3 = " + arrange_coins(n3));
        System.out.println("Result 4 = " + arrange_coins(n4));
    }
}

/*
Output

Result 1 = 2
Result 2 = 3
Result 3 = 1
Result 4 = 0
*/
