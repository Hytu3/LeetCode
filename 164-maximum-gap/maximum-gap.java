class Solution 
{
    public int maximumGap(int[] nums) 
    {
        if (nums.length == 1)
        {
            return 0;
        }
        
        Arrays.sort(nums);

        int max = nums[1] - nums[0];
        
        for (int i = 1; i < nums.length; i++)
        {
            int j = i - 1;

            if (nums[i] - nums[j] >= max)
            {
                max = nums[i] - nums[j];
            }
        }

        return max;
        
    }
}