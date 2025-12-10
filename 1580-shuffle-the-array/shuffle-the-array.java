class Solution 
{
    public int[] shuffle(int[] nums, int n) 
    {
        int[] result = new int[2 * n];

        Boolean isX = true;

        int x = 0;

        int y = n;
        
        
        for (int i = 0; i < nums.length; i++)
        {
            if (isX)
            {
                result[i] = nums[x];
                x++;
                isX = false; 
                continue;
            }
            else
            {
                result[i] = nums[y];
                y++;
                isX = true;
                continue;
            }
            

        }

        return result;
        
    }
}