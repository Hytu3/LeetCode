class Solution 
{
    public int findNumbers(int[] nums) 
    {
        // Used to count the numbers with even digits
        int numCount = 0;

        for (int num : nums)
        {
            // Used to count digits in each number
            int count = 0;
            
            while (num > 0)
            {
                count++;
                num /= 10;
            }

            if (count % 2 == 0)
            {
                numCount++;
            }
        }

        return numCount;
        
    }
}