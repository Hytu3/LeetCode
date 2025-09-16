class Solution 
{
    public int pivotIndex(int[] nums) 
    {
        // Build our sums of each side up starting at left edge
        
        int leftSum = 0;

        int rightSum = 0;
        
        for (int i = 0; i < nums.length; i++)
        {
            rightSum += nums[i];
        }

        // Increment / decrement left and right sum until they are equal
        
        for (int j = 0; j < nums.length; j++)
        {
            // If pivot index is left edge of array
            if (j == 0)
            {
              leftSum = 0;
              rightSum = rightSum - nums[0];
            } 
            
            // If pivot is neither edge
            if (nums.length > j && j > 0)
            {
                leftSum += nums[j - 1];
                rightSum -= nums[j];
            }

            // If pivot index is the right edge of array
            if (j == nums.length )
            {
                leftSum = leftSum - nums[nums.length - 1]; 
                rightSum = 0;
            }

            // If pivot is found return proper index
            if (leftSum == rightSum)
            {
                return j;
            }
            
        }

        // If no pivot found return -1
        return -1;
    }
}