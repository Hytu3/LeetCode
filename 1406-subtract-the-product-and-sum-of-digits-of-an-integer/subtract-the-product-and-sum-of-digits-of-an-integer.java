class Solution 
{
    public int subtractProductAndSum(int n) 
    {
        // Build product and sum

        int product = 1;

        int sum = 0;

        String s = Integer.toString(n);

        for (char c : s.toCharArray())
        {
            int digit = c - '0';

            product *= digit;

            sum += digit;

        }

        return product - sum;
        
    }
}