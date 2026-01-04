class Solution 
{
    public int sumFourDivisors(int[] nums) 
    {
        int sum = 0;

        // Use a hashmap to track previous numbers with 4 divisors + their sums
        HashMap <Integer,Integer> map = new HashMap<>();

        // Use a set to track ones that do not have 4 divisors
        Set <Integer> notFour = new HashSet<>();

        for (int num : nums)
        {
            // Any number less than 6 cannot have 4 divisors therefore skip
            if (num < 6)
            {
                continue;
            }
            else
            {
                // If number is already confirmed to have 4 divisors no need to call helper method
                if (map.containsKey(num))
                {
                    sum += map.get(num);
                    continue;
                }

                // If number already was proven not to have 4 digits continue
                if (notFour.contains(num))
                {
                    continue;
                }
                
                sum += countDivisors(num, map, notFour);
            }

        }

        return sum;
        
    }

    // Helper to count divisors
    public int countDivisors(int num, HashMap<Integer,Integer> map, Set<Integer> notFour)
    {
        int divisorCount = 0;
        int sum = 0;

        // Traverse only up to square root
        for (int i = 1; i * i <= num; i++)
        {
            if (num % i == 0)
            {
                // i is a divisor
                divisorCount++;
                sum += i;

                int other = num / i;

                // If  it is not a perfect square pair it must be the untracked pair to one of the previous divisors
                if (other != i)
                {
                    divisorCount++;
                    sum += other;
                }
            }
        }

        // If number has exactly 4 divisors 
        if (divisorCount == 4)
        {
            // Store in hashmap
            map.put(num, sum);
            return sum;
        }
        else
        {
            // Store in hashset
            notFour.add(num);
            return 0;
        }
    }
}