
class Solution 
{
    public List<Integer> selfDividingNumbers(int left, int right) 
    {
        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) 
        {
            int num = i;
            boolean isDivisible = true;

            // Check if digits are divisible
            while (num > 0) 
            {
                int digit = num % 10;

                // If there is a digit that contains zero
                if (digit == 0) 
                {
                    isDivisible = false;
                    break;
                }

                // Checks if number is divisible by the digit it contains 
                if (i % digit == 0) 
                {
                    // Decrement to check next digit
                    num = num / 10;
                }

                else 
                {
                    isDivisible = false;
                    break;
                }
            }

            // If number is divisible add to list and return it
            if (isDivisible) 
            {
                list.add(i); 
            }
        }

        return list;
    }
}

