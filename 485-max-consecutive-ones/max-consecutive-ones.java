class Solution 
{
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int maxSize = 0;

        List<int[]> list = new ArrayList<>(); 

        // Break down into subarrys using 0 as the split point

        int start = 0;
        
        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] == 0) 
            {
                // Add chunk only if it's non-empty
                if (start < i) 
                {
                    list.add(Arrays.copyOfRange(nums, start, i));
                }
                start = i + 1; // move start AFTER the zero
            }
        }

        // Add the last chunk if it exists
        if (start < nums.length) 
        {
            list.add(Arrays.copyOfRange(nums, start, nums.length));
        }

        // Track the largest subarray and return its size. This is max consecutive ones.
        
        for (int i = 0; i < list.size(); i++) 
        {
            int[] subarray = list.get(i);
            
            if (subarray.length > maxSize) 
            {
                maxSize = subarray.length;
            }

        }

        return maxSize;
        
    }
}