class Solution 
{
    public int minPairSum(int[] nums) 
    {
        // Sort the array
        Arrays.sort(nums);

        int max = Integer.MIN_VALUE;

        // Get the first and last elements and move inward
        for (int i = 0; i < nums.length; i++)
        {
            int j = nums.length - 1 - i;

            int sum = nums[i] + nums[j];

            if (sum >= max)
            {
                max = sum;
            }

        }

        return max;
        
    }
}