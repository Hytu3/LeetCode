class Solution 
{
    public int addDigits(int num) 
    {
        // Sum is the first digit (num / 10) + last digit of the number (num % 10)
        int sum = ((num / 10) + (num % 10));

        // Base Case
        if (sum < 10)
        {
            return sum;
        }

        num = sum;

        return addDigits(num);

        
    }
}