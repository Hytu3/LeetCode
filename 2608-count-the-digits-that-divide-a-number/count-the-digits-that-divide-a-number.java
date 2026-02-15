class Solution 
{
    public int countDigits(int num) 
    {
        int count = 0;

        // Convert to string
        String nums = Integer.toString(num);

        // Check each digit
        for (char c : nums.toCharArray())
        {
            int digit = c - '0';

            if (num % digit == 0)
            {
                count++;
            }
        }

        return count;        
    }
}