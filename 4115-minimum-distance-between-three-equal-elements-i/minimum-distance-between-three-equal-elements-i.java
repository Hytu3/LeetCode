class Solution 
{
    public int minimumDistance(int[] nums) 
    {
        int min = Integer.MAX_VALUE;

        // Edge case
        if (nums.length < 3)
        {
            return -1;
        }

        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                for (int k = j + 1; k < nums.length; k++)
                {
                    
                    if (nums[i] == nums[j] && nums[j] == nums[k])
                    {
                        int dist1 = Math.abs(i - j);
                        int dist2 = Math.abs(j - k);
                        int dist3 = Math.abs(k - i);

                        int dist = dist1 + dist2 + dist3;

                        if (dist <= min)
                        {
                            min = dist;
                        }
                    }
                    
 
                }
                
            }
            
        }

        if (min == Integer.MAX_VALUE)
        {
            return -1;
        }
        
        return min;
        
    }
}