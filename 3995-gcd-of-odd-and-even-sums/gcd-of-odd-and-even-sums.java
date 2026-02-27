class Solution 
{
    public int gcdOfOddEvenSums(int n) 
    {
        int sumOdd = 0;
        int sumEven = 0;

        int target = n * 2;

        // Build out numbers
        for (int i = 1; i <= target; i++)
        {
            // Even
            if (i % 2 == 0)
            {
                sumEven += i;
            }
            // Odd
            else
            {
                sumOdd += i;
            }
        }

        int gcd = findGcd(sumOdd,sumEven);

        return gcd;
        
    }

    public int findGcd(int sumOdd, int sumEven)
    {
        int limit = Math.min(sumOdd, sumEven);

        int result = 0;

        // Find the gcd
        for (int i = 1; i <= limit; i++)
        {
            // If both are divisible by a number
            if (sumOdd % i == 0 && sumEven % i == 0)
            {
                if (i >= result)
                {
                    result = i;
                }
            }
        }

        return result;
    }
}