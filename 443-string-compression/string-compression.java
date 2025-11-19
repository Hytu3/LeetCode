class Solution 
{
    public int compress(char[] chars) 
    {
        // Edge case
        // No need to compress
        if (chars.length == 1)
        {
            return 1;
        }

        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < chars.length; i++)
        {
            char x = chars[i];
            
            if (i == 0)
            {
                sb.append(x);
                count++;
            }
            if (i > 0)
            {
                int prev = i - 1;

                char y = chars[prev];
                
                // If there is a repeat
                if (x == y)
                {
                    count++;
                    continue;
                }
                else
                {
                    
                    if (count > 1)
                    {
                        // Add count to supressed string
                        String c = Integer.toString(count);
                        sb.append(c);              
                    }
                    
                    // Add the new character to string
                    sb.append(x);
                    count = 1;
                }
            }
        }

        // Handle remaining duplicates
        if (count > 1)
        {
            String c = Integer.toString(count);
            sb.append(c);           
        }

        char[] character = new char[sb.length()];

        for (int i = 0; i < sb.length(); i++)
        {
            chars[i] = sb.charAt(i);
        }

        return character.length;
        
        
    }
}