class Solution 
{
    public double myPow(double x, int n) 
    {
        if (n == 0) return 1.0;

        long power = n; // Use long to handle edge case when n == Integer.MIN_VALUE
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double result = 1.0;
        while (power > 0) {
            if (power % 2 == 1) {
                result *= x;
            }
            x *= x;
            power /= 2;
        }

        return result;
    }
}
