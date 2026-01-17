class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) 
    {
        while (k > 0)
        {
            int min = Integer.MAX_VALUE;

            // Find the min value
            for (int i = 0; i < nums.length; i++)
            {
                if (nums[i] <= min)
                {
                  min = nums[i];  
                }
            }

            // Only replace the first occurrence of the min value
            for (int i = 0; i < nums.length; i++)
            {
                if (nums[i] == min)
                {
                  nums[i] = nums[i] * multiplier;
                  break;
                }
            }

            k--;
        }

        return nums;
        
    }
}