class Solution 
{
    public int integerReplacement(int n) 
    {
        long number = n;
        
        // Counter for each new test case
        int count = 0;

        // Keep performing operations until base case is reached
        while (number != 1)
        {
            // Increment count every time an operation occurs
            count++;

            if (number < 4)
            {
                // Base case shortcut for small numbers
                number = number - 1;
            }
            else
            {
                // If odd and above 4
                if (number % 2 != 0)
                {
                    // If you subtract 1 and divide by 2 and number is still even go the other path
                    if (((number - 1) / 2) % 2 != 0 && number != 3)
                    {
                        number = number + 1;
                    }
                    else
                    {
                        number = number - 1;                    
                    }
                }
                // If even above/ equal to 4
                else
                {
                    number = number / 2;                
                }
            }
        }

       
        return count;
    }
}


