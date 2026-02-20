class Solution 
{
    public boolean hasAlternatingBits(int n) 
    {
        // Convert to string
        String s = Integer.toBinaryString(n);

        // Traverse string
        for (int i = 1; i < s.length(); i++)
        {
            int j = i - 1;

            char c = s.charAt(i);

            char d = s.charAt(j);

            // If there are no alternating bits
            if (c == d)
            {
                return false;
            }
        }

        return true;
        
    }
}