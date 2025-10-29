class Solution 
{
    public int smallestNumber(int n) 
    {
        int num = 1;

        // Edge case
        if (n == 1)
        {
            return 1;
        }

        // Set bit numbers in bits all follow the pattern of times 2 plus 1
        while (num < n)
        {
            num = (num * 2) + 1;
        }

        return num;                
    }
}