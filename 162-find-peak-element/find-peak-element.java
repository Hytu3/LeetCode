class Solution 
{
    public int findPeakElement(int[] nums) 
    {
        int index = 0;
        
        // If array only has one element
        if (nums.length == 1)
        {
            return 0;
        }
        
        // Traverse array
        for (int i = 0; i < nums.length; i++)
        {
            int j = i + 1;
            int k = i - 1;
            
            // Edge case at first element
            if (i == 0)
            {
                if (nums[i] > nums[j])
                {
                    index = i;
                    break;
                }
            }

            // Edge case at last element
            if (i == nums.length - 1)
            {
                if (nums[i] > nums[k])
                {
                    index = i;
                    break;
                }
            }

            // Check to prevent out of bounds error
            if (i >= 1 && i < nums.length - 1)
            {
                if (nums[i] > nums[j] && nums[i] > nums[k])
                {
                    index = i;
                }                
            }


        }

        return index;
        
    }
}