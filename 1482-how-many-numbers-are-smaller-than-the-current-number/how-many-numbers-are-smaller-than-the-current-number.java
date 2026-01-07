class Solution 
{
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
        {
            // Count how many are smaller
            int count = 0;

            // Represents the current number
            int current = nums[i];
            
            for (int j = 0; j < nums.length; j++)
            {
                // Increment count for every number smaller than new current
                if (nums[j] < current)
                {
                    count++;
                }
            }

            // Build new array
            arr[i] = count;
        }

        return arr;
        
    }
}