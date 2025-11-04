class Solution 
{
    public int countEven(int num) 
    {
        int count = 0;

        for (int i = 1; i <= num; i++)
        {
            // Convert number to string
            String number = Integer.toString(i);

            int sum = 0;
            
            // Traverse string
            for (int j = 0; j < number.length(); j++)
            {
                
                // Get each digit character
                char digitChar = number.charAt(j);

                // Convert back to int
                int digit = digitChar - '0';

                // Add to sum
                sum += digit;

            }

            // Check if sum is even

            if (sum % 2 == 0)
            {
                count++;
            }
        }

        return count;
        
    }
}