class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        int result = 0;
        boolean isNegative = false;

        // Step 1: Ignore leading whitespace
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Check for optional '+' or '-' sign
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            isNegative = s.charAt(i) == '-';
            i++;
        }

        // Step 3: Convert digits to integer
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Step 4: Handle overflow before it happens
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return isNegative ? -result : result;
    }
}



