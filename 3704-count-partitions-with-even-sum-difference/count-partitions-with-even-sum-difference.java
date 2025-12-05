class Solution 
{
    public int countPartitions(int[] nums) 
    {

        int count = 0;

        int leftSum = 0;

        int rightSum = 0;

        // Get right sum
        for (int num : nums)
        {
            rightSum += num;
        }

        // Traverse again
        for (int i = 0; i < nums.length - 1; i++)
        {
            leftSum += nums[i];
            rightSum -= nums[i];

            int diff = leftSum - rightSum;

            if (diff % 2 == 0)
            {
                count++;
            }
        }

        
        return count;

        
    }
}