class Solution 
{
    public int countConsistentStrings(String allowed, String[] words) 
    {
        int count = 0;

        Boolean isConsistent = true;

        Set <Character> set = new HashSet<>();

        // Put into a set
        for (char c : allowed.toCharArray())
        {
            set.add(c);
        }

        // Traverse words
        for (int i = 0; i < words.length; i++)
        {
            String s = words[i];

            // Reset every iteration
            isConsistent = true;

            for (char c : s.toCharArray())
            {
                if (!set.contains(c))
                {
                    isConsistent = false;
                }
            }

            if (isConsistent)
            {
                count++;
            }
        }

        return count;
        
    }
}