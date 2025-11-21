class Solution 
{
    public int numSub(String s) 
    {
        final int MOD = 1_000_000_007;

        long count = 0;
        long sum = 0;

        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '1')
            {
                count++;
            }
            else
            {
                sum = (sum + helper(count, MOD)) % MOD;
                count = 0;
            }
        }

        // Handle trailing 1's
        if (count > 0)
        {
            sum = (sum + helper(count, MOD)) % MOD;
        }

        return (int) sum;
    }

    // Your original counting logic, but modulo-protected
    public long helper(long num, final int MOD)
    {
        long result = 0;

        while (num > 0)
        {
            result = (result + num) % MOD;
            num--;
        }

        return result;
    }
}
