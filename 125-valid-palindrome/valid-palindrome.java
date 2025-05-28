class Solution 
{
    public boolean isPalindrome(String s) 
    {
        // Convert string to lower case
         s = s.toLowerCase();

        // Make a new string to remove all non alphanumeric characters
         String S = s.replaceAll("[^a-zA-Z0-9]", "");

        // Create 2 pointers. One at the start of the string and one at the end

        int start = 0;

        int end = S.length() - 1;

        while (start <= end)
        {
            char startChar = S.charAt(start);
            char endChar = S.charAt(end);

            if (startChar != endChar)
            {
                return false;
            }

            start++;
            end--;
        }

        return true;
        

        
    }
}