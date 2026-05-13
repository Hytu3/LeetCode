class Solution 
{
    public String[] findWords(String[] words) 
    {
        List<String> list = new ArrayList<>();
        
        // Construct 3 sets
        Set<Character> row1 = Set.of('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p');

        
        Set<Character> row2 = Set.of('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l');

        
        Set<Character> row3 = Set.of('z', 'x', 'c', 'v', 'b', 'n', 'm');

        // Check if a word can be typed using a single row
        for (String s : words)
        {
            String lowerCase = s.toLowerCase();
            
            Boolean firstRow = true;
            Boolean secondRow = true;
            Boolean thirdRow = true;

            for (char c : lowerCase.toCharArray())
            {
                if (!row1.contains(c))
                {
                    firstRow = false;
                }

                if (!row2.contains(c))
                {
                    secondRow = false;
                }

                if (!row3.contains(c))
                {
                    thirdRow = false;
                }
            }

            if (firstRow || secondRow || thirdRow)
            {
                list.add(s);
            }
        }

        // Convert to array
        String[] result = new String[list.size()];

        for (int i = 0; i < list.size(); i++)
        {
            result[i] = list.get(i);
        }

        return result;
        
    }
}