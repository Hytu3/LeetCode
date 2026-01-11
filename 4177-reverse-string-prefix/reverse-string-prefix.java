class Solution 
{
    public String reversePrefix(String s, int k) 
    {
        StringBuilder sb = new StringBuilder();

        // Add the first k characters in reverse
        for (int i = k - 1; i >= 0; i--)
        {
            char c = s.charAt(i);

            sb.append(c);
        }

        // Add the remainders in regular order
        for (int i = k; i < s.length(); i++)
        {
            char c = s.charAt(i);

            sb.append(c);
        }

        return sb.toString();
        
    }
}