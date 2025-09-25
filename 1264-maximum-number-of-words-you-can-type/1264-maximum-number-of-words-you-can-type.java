class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        
        // Put all broken letters in a hashmap

        HashMap <Character,Character> map = new HashMap<>();
        
        for (int i = 0; i < brokenLetters.length(); i++)
        {
            char c = brokenLetters.charAt(i);

            map.put(c,c);

        }


        // Seperate each string into string list by space

        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int k = 0; k < text.length(); k++)
        {
            char x = text.charAt(k);

            sb.append(x);

            if (x == ' ')
            {
                
                // Delete the space in stringbuilder
                sb.deleteCharAt(sb.length() - 1);

                // Add string to list
                String s = sb.toString();

                list.add(s);

                // Reset stringbuilder
                sb.setLength(0);
            }

            
        }

        // Add remainders

        if (sb.length() > 0)
        {
            String s = sb.toString();

            list.add(s);
        }

        // Check if each string contains a broken letter. If so, delete the string from list
        
        for (int x = 0; x < list.size(); x++)
        {
            String string = list.get(x);

            for (int y = 0; y < string.length(); y++)
            {
                char z = string.charAt(y);

                if (map.containsKey(z))
                {
                    list.remove(x);  // Remove by index
                    x--;             // Step back so next word isn’t skipped
                    break;           // Break inner loop since word is gone
                }
            }
        }

        // Return the remaining words that werent deleted
        
        return list.size();
        
    }
}