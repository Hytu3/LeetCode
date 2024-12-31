class Solution {
    public int[] plusOne(int[] digits) {
        // Start from rightmost digit
        for (int i = digits.length - 1; i >= 0; i--) {
            // If digit is less than 9, we can simply increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If digit is 9, set it to 0 and continue to next digit
            digits[i] = 0;
        }
        
        // If we're here, it means all digits were 9
        // Create new array with one extra digit
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}