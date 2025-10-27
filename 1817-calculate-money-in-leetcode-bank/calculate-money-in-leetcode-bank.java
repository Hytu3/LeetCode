class Solution 
{
    public int totalMoney(int n) 
    {
        int sum = 0;
        int deposit = 1;
        int prev = 1;
        int count = 1;
        
        while (n > 0)
        { 
            sum += deposit;

            // Increment counters
            deposit++;
            count++;
            n--;

            // If a week has passed, reset deposit to next Monday
            if ((count - 1) % 7 == 0)
            {
                prev++;
                deposit = prev;
            }
        }

        return sum;
    }
}
