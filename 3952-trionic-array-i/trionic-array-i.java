class Solution 
{
    public boolean isTrionic(int[] nums) 
    {
        // Find p first

        int p = -1;


        for (int i = 1; i < nums.length; i++)
        {
            int j = i - 1;

            if (nums[i] > nums[j])
            {
                continue;
            }

            // Found p 
            p = j;
            break;
        }

        // Check if index p is ever found
        if (p < 0)
        {
            return false;
        }

        // Find q

        int q = -1;

        for (int i = p + 1; i < nums.length; i++)
        {
            // J will start at p
            int j = i - 1;

            if (nums[i] < nums[j])
            {
                continue;
            }

            // Found q 
            q = j;
            break;
        }

        // Check if index q is ever found
        if (q < 0)
        {
            return false;
        }

        // Check if the remaining interval is increasing
        Boolean isIncreasing = true;
        
        for (int i = q + 1; i < nums.length; i++)
        {
            int j = i - 1;

            if (nums[i] > nums[j])
            {
                continue;
            }
            else
            {
                isIncreasing = false;      
            }
        }

        // If such indexes exist and the remainder is increasing return true
        if (isIncreasing && p > 0 && q > 0)
        {
            return true;
        }

        // Otherwise return false
        return false;
        
    }
}