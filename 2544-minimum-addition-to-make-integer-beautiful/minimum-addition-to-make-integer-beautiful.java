class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        long original = n;
        long base = 1;

        while (digitSum(n) > target) {
            n = (n / 10 + 1) * 10; // Round to next multiple of 10
            base *= 10;

            // Adjust rounding step: we should round n based on the full base, not just 10
            while (n % base != 0) {
                n = (n / base + 1) * base;
            }
        }

        return n - original;
    }

    private int digitSum(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

