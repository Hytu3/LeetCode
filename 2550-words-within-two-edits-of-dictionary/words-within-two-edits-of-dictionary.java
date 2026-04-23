class Solution 
{
    public List<String> twoEditWords(String[] queries, String[] dictionary) 
    {
        List<String> list = new ArrayList<>();

        for (String word1 : queries)
        {
            Boolean canAdd = false;
            
            for (String word2 : dictionary)
            {
                int count = 0;

                if (word1.equals(word2))
                {
                    canAdd = true;
                    break;
                }

                // Traverse character in word
                for (int i = 0; i < word1.length(); i++)
                {
                    char x = word1.charAt(i);
                    char y = word2.charAt(i);

                    if (x != y)
                    {
                        count++;
                    }
                }

                if (count <= 2)
                {
                    canAdd = true;
                    break;
                }
            }

            if(canAdd)
            {
                list.add(word1);
                continue;
            }
            
        }
        
        return list;
    }
}