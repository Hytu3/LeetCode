class Solution 
{
    public boolean isUgly(int n) 
    {
        if (n <= 0) return false; // Ugly numbers are positive only

        // Remove all factors of 2, 3, and 5
        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;

        // If the remaining number is 1, it was only made of 2, 3, and 5
        return n == 1;
    }
}
