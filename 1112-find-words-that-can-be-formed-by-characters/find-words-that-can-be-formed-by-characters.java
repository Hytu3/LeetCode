class Solution 
{
    public int countCharacters(String[] words, String chars) 
    {
        HashMap<Character,Integer> map = new HashMap<>();

        int sum = 0;
        
        // Traverse through chars
        // Add its letter frequency
        for (int j = 0; j < chars.length(); j++)
        {
            char d = chars.charAt(j);

            int freq = 1;
            
            if (map.containsKey(d))
            {
                // Increase frequency
                freq = map.get(d) + 1;
            }

            map.put(d, freq);
        }
        
        
        // Go through each string in words
        for (String s : words)
        {
            // ✅ Create a clone of the original map for this word
            HashMap<Character, Integer> cloneMap = new HashMap<>(map);

            // Traverse through string itself
            for (int i = 0; i < s.length(); i++)
            {
                char c = s.charAt(i);
                
                int freq = -1;
            
                if (cloneMap.containsKey(c))
                {
                    // Decrease frequency
                    freq = cloneMap.get(c) - 1;
                }

                cloneMap.put(c, freq);
            }

            // Boolean flag to check if word can be formed by characters
            Boolean canForm = true;
            
            // Check for negative frequency
            for (Integer value : cloneMap.values()) 
            {
                if (value != null && value < 0) 
                {
                    canForm = false; // Found a negative value
                }
            }

            // Add the length of the good string
            if (canForm)
            {
                sum += s.length();
            }

        }
        
        return sum;
    }
}

