import java.util.ArrayList;
import java.util.List;

class Solution {
    public int climbStairs(int n) {
        List<Integer> list = new ArrayList<>();
        // Base cases for steps 0 and 1
        list.add(1);  // 0 steps: 1 way
        list.add(1);  // 1 step: 1 way

        if (n < 2) {
            return list.get(n);
        }

        // Start building from step 2 up to n
        for (int i = 2; i <= n; i++) {
            // Get the last two values we've calculated
            int prev1 = list.get(i - 1);  // Previous step
            int prev2 = list.get(i - 2);  // Step before previous
            int sum = prev1 + prev2;
            list.add(sum);
        }

        return list.get(n);
    }
}