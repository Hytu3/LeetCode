class Solution 
{
    public boolean hasSameDigits(String s) 
    {
        // Base case
        if (s.length() == 2)
        {
            char y = s.charAt(0);

            char z = s.charAt(1);

            if (y == z)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        // If string is greater

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < s.length(); i++)
        {
            int j = i - 1;

            // Convert characters to numbers
            char digitChar1 = s.charAt(j);
            char digitChar2 = s.charAt(i);

            int addNum1 = digitChar1 - '0';
            int addNum2 = digitChar2 - '0';

            // Get the digit
            int digit = (addNum1 + addNum2) % 10;

            // Convert back to character
            char c = (char) ('0' + digit);

            sb.append(c);


        }

        String str = sb.toString();

        // Recursive call until base case is met
        return hasSameDigits(str); 



    }
}