class Solution 
{
    public int balancedStringSplit(String s) 
    {
        int count = 0;

        // Keep track of Rs and Ls
        int r = 0;

        int l = 0;
        
        for (char c : s.toCharArray())
        {
            if (c == 'R')
            {
                r++;
            }

            if (c == 'L')
            {
                l++;
            }

            // If there is the same number of r's and l's string can be split
            if (r == l)
            {
                count++;
            }
        }
        
        return count;      
    }
}