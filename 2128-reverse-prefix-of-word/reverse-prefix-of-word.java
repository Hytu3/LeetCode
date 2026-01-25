class Solution 
{
    public String reversePrefix(String word, char ch) 
    {
        StringBuilder sb = new StringBuilder();
        
        int index = 0;

        Boolean isFound = false;

        // Look for ch in word and use the index as a pivot
        for (int i = 0; i < word.length(); i++)
        {
            char c = word.charAt(i);

            sb.append(c);
            
            if (c == ch)
            {
                index = i;
                isFound = true;
                break;
            }
        }

        // ch was never in the word
        if (!isFound)
        {
            return sb.toString();
        }
        
        // Reverse current segment
        sb.reverse();

        // Add the rest in regular order
        for (int i = index + 1; i < word.length(); i++)
        {
            char c = word.charAt(i);

            sb.append(c);
            
        }

        return sb.toString();


        
    }
}