class Solution 
{
    public boolean checkPerfectNumber(int num) 
    {
        // if the number doesnt have divisors and sum equals number return true
        if (!isPrime(num) && findSum(num) == true)
        {
            return true;
        }

        return false;
    }


    // Helper method
    public boolean isPrime(int num) 
    {
        if (num <= 1) return false; // 0 and 1 are not prime
        if (num == 2) return true;  // 2 is the only even prime number
        if (num % 2 == 0) return false; // eliminate even numbers

        for (int i = 3; i <= Math.sqrt(num); i += 2) 
        {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Second helper method
    public boolean findSum(int num)
    {
        int divisor = 1;

        List<Integer> list = new ArrayList<>();

        int sum = 0; // Sum variable used to find the sum of all divisors
        
        while (divisor <= num)
        {
            // Find divisors and place them in an array list
            if (num % divisor == 0)
            {
                list.add(divisor);
            }
            divisor++;
        }

        // Find the sum of all divisors minus the last value
        for (int i = 0; i < list.size() - 1; i++) 
        {
            sum += list.get(i);
        }

        if (sum == num)
        {
            return true;
        }

        return false;

    }

}