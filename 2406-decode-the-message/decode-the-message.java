class Solution 
{
    public String decodeMessage(String key, String message) 
    {
        HashMap <Character,Character> map = new HashMap<>();

        LinkedHashSet <Character> set = new LinkedHashSet<>();

        // Add first occurrence of each letter
        for (char c : key.toCharArray())
        {
            if (c == ' ')
            {
                continue;
            }
            
            set.add(c);
        }

        char letter = 'a';
        
        // Build hashmap
        for (char c : set)
        {

            map.put(c,letter);

            letter++;

        }

        // Build out secret message

        StringBuilder sb = new StringBuilder();

        for (char c : message.toCharArray())
        {
            if (c == ' ')
            {
                sb.append(' ');
                continue;
            }
            
            sb.append(map.get(c));
        }

        return sb.toString();
        
    }
}