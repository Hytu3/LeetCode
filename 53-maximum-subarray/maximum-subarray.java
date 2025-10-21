class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        // Edge case
        if (nums.length == 0)
        {
            return 0;
        }

        // Initialize both to the first element
        int maxSum = nums[0];
        int currentSum = nums[0];

        // Start from second element
        for (int i = 1; i < nums.length; i++)
        {
            // Either extend the current subarray or start new from nums[i]
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update max if necessary
            if (currentSum > maxSum)
            {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }
}
