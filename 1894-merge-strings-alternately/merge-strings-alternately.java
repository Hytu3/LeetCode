class Solution 
{
    public String mergeAlternately(String word1, String word2) 
    {
        StringBuilder sb = new StringBuilder();

        int length = Math.max(word1.length(), word2.length());

        for (int i = 0; i < length; i++)
        {
            // Out of bounds checker to add remaining chars
            if (i > word1.length() - 1)
            {
                char y = word2.charAt(i);
                sb.append(y);
                continue;

            }

            else if (i > word2.length() - 1)
            {
                char x = word1.charAt(i);
                sb.append(x);
                continue;
                
            }

            // If not out of bounds add things manually
            else
            {
                char x = word1.charAt(i);
                char y = word2.charAt(i);

                sb.append(x);
                sb.append(y);

            }
        }

        return sb.toString();
        
    }
}