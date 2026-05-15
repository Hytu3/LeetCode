class Solution 
{
    public boolean isGood(int[] nums) 
    {
        // Sort nums
        Arrays.sort(nums);

        // Get the max
        int max = nums[nums.length - 1];

        // Good array checker
        if (nums.length != max + 1)
        {
            return false;
        }

        // Build Base array
        int[] base = new int[max + 1];
        int val = 1;
        
        for (int i = 0; i < base.length; i++)
        {
            if (i == base.length - 1)
            {
                base[i] = max;
                continue;
            }

            if (i == base.length - 2)
            {
                base[i] = max;
                continue;
            }

            base[i] = val;

            val++;

        }

        return Arrays.equals(nums,base);
        
    }
}