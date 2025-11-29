import java.util.*;

public class last_stone_58 {

    // -------------------------------------------------------
    // Problem
    // You are given an array stones[] where each element
    // represents the weight of a stone.
    //
    // Game Rules:
    //  -> Each turn pick the two heaviest stones (x <= y)
    //  -> If x == y → both stones are destroyed
    //  -> If x != y → new stone of weight (y - x) is formed
    //
    // Continue until 0 or 1 stone remains.
    // Return weight of last remaining stone, or 0 if none.
    //
    // Examples:
    //   [2,7,4,1,8,1] -> 1
    //   [1]           -> 1
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method = Max Heap (Priority Queue)
    //
    // Idea
    //  -> Always remove two largest values → Max-Heap needed.
    //  -> Smash them and push result (if > 0) back to heap.
    //
    // Time Complexity  = O(n log n)
    // Space Complexity = O(n)
    // -------------------------------------------------------
    public static int last_stone_weight(int[] stones) {

        // Max-heap using reverse comparator
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Push all stones into heap
        for (int s : stones) {
            pq.add(s);
        }

        // Continue smashing until at most 1 remains
        while (pq.size() > 1) {
            int y = pq.poll();   // largest
            int x = pq.poll();   // second largest

            // If unequal, insert leftover stone
            if (x != y) {
                pq.add(y - x);
            }
        }

        // If heap empty return 0, else the remaining stone
        return pq.isEmpty() ? 0 : pq.poll();
    }

    // MAIN method
    public static void main(String[] args) {

        int[] stones1 = {2, 7, 4, 1, 8, 1};
        int[] stones2 = {1};
        int[] stones3 = {10, 10};
        int[] stones4 = {5, 3, 1};

        System.out.println("Result 1 = " + last_stone_weight(stones1)); // 1
        System.out.println("Result 2 = " + last_stone_weight(stones2)); // 1
        System.out.println("Result 3 = " + last_stone_weight(stones3)); // 0
        System.out.println("Result 4 = " + last_stone_weight(stones4)); // 1
    }
}

/*
Output
Result 1 = 1
Result 2 = 1
Result 3 = 0
Result 4 = 1
*/
