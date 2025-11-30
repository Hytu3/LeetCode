class Solution 
{
    public String makeFancyString(String s) 
    {
        StringBuilder sb = new StringBuilder();

        // Tracker to count repeating characters
        int count = 0;
        
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);

            int lastIndex = sb.length() - 1;

            // Always add the first character
            if (i == 0)
            {
                sb.append(c);
                count++;
                continue;
            }

            // If we are on the last char
            if (i == s.length() - 1)
            {
                if (c == sb.charAt(lastIndex))
                {
                    // If there is already 2 repeats
                    if (count >= 2)
                    {
                        continue;
                    }
                    
                    // Add the char if there is only 1 repeat
                    sb.append(c);
                    count++;
                    break;
                }
                // If there is no repeat just add last character
                else
                {
                    sb.append(c);
                    break;
                }
            

            }

            // If repeat found
            if (c == sb.charAt(lastIndex))
            {
                // If there is already 2 repeats
                if (count >= 2)
                {
                    continue;
                }
                
                // Add the char if there is only 1 repeat
                sb.append(c);
                count++;
                continue;
            }
            // No repeat found
            else
            {
                // Reset
                count = 1;
                sb.append(c);
                continue;
            }

        }

        return sb.toString();

        
    }
}