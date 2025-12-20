class Solution 
{
    public int minDeletionSize(String[] strs) 
    {
        String x = strs[0];

        // Number of columns
        int numColumns = x.length();

        int count = 0;

        // Build new string from each column
        for (int i = 0; i < numColumns; i++)
        {
             StringBuilder sb = new StringBuilder();
             
             // Traverse each string
             for (int j = 0; j < strs.length; j++)
             {
                String s = strs[j];

                char c = s.charAt(i);

                // If stringbuilder isnt empty and current character is less than previous add char
                if (!sb.isEmpty() && c < sb.charAt(sb.length() - 1))
                {
                    // Increment count to show this column needs to be deleted
                    count++;
                    // Jump to next column
                    break;
                }

                // Add to stringbuilder to use it to compare to next char
                sb.append(c);

             }
        }

        
        return count;

        
    }
}