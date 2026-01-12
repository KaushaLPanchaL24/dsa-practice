public class teemo_attacking_66 {

    // -------------------------------------------------------
    // Problem
    // Our hero Teemo attacks an enemy at specific times.
    
    // Each attack poisons the enemy for a fixed duration.
    // If another attack happens before the poison ends,
    // the poison time resets (does NOT stack).
    
    // Given
    //  - time_series[] → attack times (sorted)
    //  - duration    → poison duration per attack
    
    // Return the total time the enemy is poisoned.
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Examples
    // time_series = [1, 4], duration = 2  → 4
    // time_series = [1, 2], duration = 2  → 3
    // -------------------------------------------------------

    // -------------------------------------------------------
    // Method = Greedy
    
    // Idea
    //  -> For each attack, check the gap to the next attack
    //  -> If gap >= duration → full duration is counted
    //  -> If gap < duration  → only the gap is counted
    
    // why ?
    //  -> Poison overlaps, so we avoid double counting
    
    // Time Complexity  = O(n)
    // Space Complexity = O(1)
    // -------------------------------------------------------
    public static int find_poisoned_duration(int[] time_series, int duration) {

        // Edge cases
        if (time_series.length == 0 || duration == 0) return 0;

        int total_poison_time = 0;

        // Process all attacks except the last one
        for (int i = 0; i < time_series.length - 1; i++) {
            int attack_gap = time_series[i + 1] - time_series[i];
            total_poison_time += Math.min(attack_gap, duration);
        }

        // Add full duration for the last attack
        total_poison_time += duration;

        return total_poison_time;
    }

    // MAIN method
    public static void main(String[] args) {

        int[] time_series_1 = {1, 4};
        int duration1 = 2;   // expected = 4

        int[] time_series_2 = {1, 2};
        int duration2 = 2;   // expected = 3

        int[] time_series_3 = {1, 5, 10};
        int duration3 = 3;   // expected = 9

        System.out.println("Result 1 = " + find_poisoned_duration(time_series_1, duration1));
        System.out.println("Result 2 = " + find_poisoned_duration(time_series_2, duration2));
        System.out.println("Result 3 = " + find_poisoned_duration(time_series_3, duration3));
    }
}

/*
Output

Result 1 = 4
Result 2 = 3
Result 3 = 9
*/
