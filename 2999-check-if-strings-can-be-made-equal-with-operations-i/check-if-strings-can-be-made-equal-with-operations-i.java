class Solution 
{
    public boolean canBeEqual(String s1, String s2) 
    {
        // Edge case check
        if (s1.equals(s2))
        {
            return true;
        }
        
        
        for (int i = 0; i < s1.length(); i++)
        {
            char c = s1.charAt(i);

            // Check both left anf right boundaries
            
            // Left
            if (i + 2 < s1.length())
            {
                char right = s2.charAt(i + 2);
                char curr = s2.charAt(i);

                if (c != right && c != curr)
                {
                    return false;
                }
            }

            // Right
            // Left
            if (i - 2 >= 0)
            {
                char left = s2.charAt(i - 2);
                char curr = s2.charAt(i);

                if (c != left && c != curr)
                {
                    return false;
                }
            }
        }

        return true;
        
    }
}