class Solution {
    public int reverse(int x) {
        ArrayList<Integer> digits = new ArrayList<>();

        // Extract digits
        while (x >= 10 || x <= -10) {
            digits.add(x % 10);
            x = x / 10;
        }
        digits.add(x);

        // Rebuild reversed number safely
        int sum = 0;
        for (int digit : digits) {
            // Check for overflow BEFORE multiplying and adding
            if (sum > Integer.MAX_VALUE / 10 || sum < Integer.MIN_VALUE / 10) {
                return 0;
            }

            int newSum = sum * 10 + digit;

            // Extra overflow check just in case
            if ((newSum - digit) / 10 != sum) {
                return 0;
            }

            sum = newSum;
        }

        return sum;
    }
}

