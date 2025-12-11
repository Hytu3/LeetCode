class Solution 
{
    public List<Integer> findWordsContaining(String[] words, char x) 
    {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++)
        {
            String s = words[i];

            // Traverse each word
            for (char c : s.toCharArray())
            {
                if (c == x)
                {
                    // Add index to list and go to next word
                    list.add(i);
                    break;
                }
            }
        }

        return list;
        
    }
}