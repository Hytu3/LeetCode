import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        return detectCycle(n);
    }

    private boolean detectCycle(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1) {
            if (seen.contains(n)) {
                return false; // Cycle detected
            }
            seen.add(n);
            n = getSumOfSquares(n);
        }

        return true; // Happy number found
    }

    private int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
