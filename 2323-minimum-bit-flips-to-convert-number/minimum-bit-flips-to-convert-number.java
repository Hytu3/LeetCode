class Solution 
{
    public int minBitFlips(int start, int goal) 
    {
        
        int count = 0;

        // Turn both start and goal to strings of same length and count mismatching characters
        String s = Integer.toBinaryString(start);
        String g = Integer.toBinaryString(goal);

        // Logic to ensure both are the same length
        if (s.length() < g.length())
        {
            StringBuilder sb = new StringBuilder(s);
            
            while (sb.length() < g.length())
            {
                sb.insert(0,0);
            }

            s = sb.toString();

        }

        if (g.length() < s.length())
        {
            StringBuilder sb = new StringBuilder(g);
            
            while (sb.length() < s.length())
            {
                sb.insert(0,0);         
            }

            g = sb.toString();
        }

        // Now that strings are equal track all mismatches
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);

            char d = g.charAt(i);

            if (c != d)
            {
                count++;
            }
        }


        return count;
        
    

        
    }
}