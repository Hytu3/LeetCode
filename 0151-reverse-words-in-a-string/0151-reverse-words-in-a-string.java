class Solution 
{
    public String reverseWords(String s) 
    {
        List<String> list = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        // Store all seperarate strings in a list
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            
            if (c == ' ')
            {
                // If spaces are leading or ending sb must be empty
                if (sb.isEmpty())
                {
                    continue;
                }
                
                String str = sb.toString();

                list.add(str);

                // Empties out stringbuilder
                sb.setLength(0);
            }

            if (c != ' ')
            {
              sb.append(c);
            }
        }
        
        // Handle remaining stringbuilder logic
        if (sb.length() > 0)
        {
            String str = sb.toString();

            list.add(str);

            sb.setLength(0); 
        }

        // Traverse string list in reverse and add them to another stringbuilder
        StringBuilder sb1 = new StringBuilder();

        for (int j = list.size() - 1; j >= 0; j--)
        {
            // Make sure no reversed string contains a leading space
            if (j == list.size() - 1)
            {
                sb1.append(list.get(j));
                continue;
            }

            // Add spaces between the rest of the words
            sb1.append(" ");
            sb1.append(list.get(j));
            
        }

        String result = sb1.toString();

        return result;

        
        
    }
}