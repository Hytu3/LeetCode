class Solution 
{
    public String addBinary(String a, String b) 
    {
StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = digitA + digitB + carry;
            carry = sum / 2;  // Calculate carry
            result.append(sum % 2);  // Append current bit to result

            i--;  // Move to the next bit in `a`
            j--;  // Move to the next bit in `b`
        }

        return result.reverse().toString();  // Reverse the result for the correct order
        
    }
}