class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        if (strs.length == 1)
        {
            return strs[0];
        }

        StringBuilder sb = new StringBuilder();

        String firstString = strs[0];

        Boolean canContinue = true;

        // Traverse characters of first string
        for (int i = 0; i < firstString.length(); i++)
        {
            char c = firstString.charAt(i);

            sb.append(c);


            // Check rest of strings and see if they start with substrings of the first string
            for (int j = 1; j < strs.length; j++)
            {
                if (strs[j].startsWith(sb.toString()))
                {
                    continue;
                }
                else
                {
                    canContinue = false;
                    break;
                }
            }

            if (!canContinue)
            {
                sb.deleteCharAt(sb.length() - 1);
                break;
            }

        }

        return sb.toString();
        
    }
}