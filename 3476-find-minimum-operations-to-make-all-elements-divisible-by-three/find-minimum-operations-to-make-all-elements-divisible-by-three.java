class Solution 
{
    public int minimumOperations(int[] nums) 
    {
        int count = 0;

        for (int number: nums)
        {
            if (number % 3 == 0)
            {
                continue;
            }
            else
            {
                while (number % 3 != 0)
                {
                    count++;

                    // Checks if closer to the greater divisor of 3
                    if ((number + 1) % 3 != 0)
                    {
                        number =  number - 1;
                        continue;
                    }
                    

                    // Checks if closer to the lesser divisor of 3
                    if ((number - 1) % 3 != 0)
                    {
                        number = number + 1;
                        continue;
                    }

                }
                

            }
        }

        return count;
        
    }
}