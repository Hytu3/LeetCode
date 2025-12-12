class Solution 
{
    public int smallestEvenMultiple(int n) 
    {
        // Edge case
        // n can be a multiple of itself and 2
        if (n % 2 == 0)
        {
            return n;
        }

        // Recurse
        return smallestEvenMultiple(n * 2); 
        
    }
}