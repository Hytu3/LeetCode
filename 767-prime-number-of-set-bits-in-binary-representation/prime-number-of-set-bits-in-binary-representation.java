class Solution 
{
    public int countPrimeSetBits(int left, int right) 
    {
        int count = 0;

        for (int i = left; i <= right; i++)
        {
            // Count set bits
            int setBitCount = 0;
            
            String s = Integer.toBinaryString(i);

            for (char c : s.toCharArray())
            {
                if (c == '1')
                {
                    setBitCount++;
                }
            }

            // Check if setBitCount is prime
            Boolean isPrime = checkPrime(setBitCount);

            if (isPrime)
            {
                count++;
            }


        }

        return count;
        
    }

    public Boolean checkPrime(int x)
    {
        if (x == 1 || x == 0)
        {
            return false;
        }

        if (x == 2)
        {
            return true;
        }

        if (x % 2 == 0)
        {
            return false;
        }

        // Check all numbers before the numbers square root to see if there is a divisor
        int squareRoot = (int) Math.sqrt(x);

        for (int i = 3; i <= squareRoot; i++)
        {
            if (x % i == 0)
            {
                return false;
            }
        }

        return true;
    }
}