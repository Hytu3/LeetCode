class Solution 
{
    public int alternatingSum(int[] nums) 
    {
        // Start with addition
        Boolean add = true;

        int sum = 0;

        for (int num : nums)
        {
            if (add == true)
            {
                sum += num;

                // Switch boolean flag
                add = false;

                continue;

            }
            else
            {
                sum -= num;

                // Switch boolean flag
                add = true;

                continue;
            }
        }

        return sum;
        
    }
}