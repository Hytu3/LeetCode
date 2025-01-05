public class Solution 
{
    public int climbStairs(int n) 
    {
        if (n <= 2) 
        {
            return n; // Base cases: 1 step = 1 way, 2 steps = 2 ways
        }

        int[] dp = new int[n + 1]; // Create an array to store the results
        dp[1] = 1; // 1 step: 1 way
        dp[2] = 2; // 2 steps: 2 ways

        // Fill the dp array for all steps from 3 to n
        for (int i = 3; i <= n; i++) 
        {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n]; // Return the result for n steps
    }
}
