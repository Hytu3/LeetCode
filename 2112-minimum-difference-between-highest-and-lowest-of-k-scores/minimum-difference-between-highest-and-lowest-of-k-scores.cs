public class Solution 
{
    public int MinimumDifference(int[] nums, int k) 
    {
        // Sort array
        Array.Sort(nums);

        int min = 1000000;

        // Use sliding window
        for (int i = k; i <= nums.Length; i++)
        {
            int j = i - k;

            int highest = 0;

            int lowest = 1000000;

            // Use sliding window to get the difference of lowest and highest of k scores
            for (int x = j; x < i; x++)
            {
                if (nums[x] > highest)
                {
                    highest = nums[x];
                }

                if (nums[x] < lowest)
                {
                    lowest = nums[x];
                }
            }

            int diff = highest - lowest;

            if (diff <= min)
            {
                min = diff;
            }
        }

        return min;
        
    }
}