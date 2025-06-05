class Solution 
{
    public boolean detectCapitalUse(String word) 
    {
        String uppercased = word.toUpperCase();
        String lowercased = word.toLowerCase();

        char firstLetter = word.charAt(0);

        int capCount = 0;

        for (int i = 0; i < word.length(); i++)
        {
            char c = word.charAt(i);

            if (Character.isUpperCase(c))
            {
                capCount++;
            }
        }

        // Checks if it is all caps
        if (word.equals(uppercased))
        {
            return true;
        }

        // Checks if it is all lowercase
        if (word.equals(lowercased))
        {
            return true;
        }

        // Checks if only first letter capitalized
        if (Character.isUpperCase(firstLetter) && word.substring(1).equals(word.substring(1).toLowerCase()))
        {
            return true;
        }

        return false;
    }
}
