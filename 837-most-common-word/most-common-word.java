class Solution 
{
    public String mostCommonWord(String paragraph, String[] banned) 
    {
        // Turn everything lowercase in paragraph

        String lowercase = paragraph.toLowerCase();

        HashMap<String,Integer> map = new HashMap<>();


        StringBuilder sb = new StringBuilder();
        
        // Add every word in hashmap + frequency checker
        for (int i = 0; i < lowercase.length(); i++)
        {
            // Build the word up
            char c = lowercase.charAt(i);

            // If character is a letter build it to a word
            if (Character.isLetterOrDigit(c)) 
            {
                sb.append(c);
            } 
            
            // Once a space or symbol is encountered, save to string and add to hashmap frequency tracker
            else 
            {
                // Dont add an empty string
                if (sb.length() > 0)
                {
                    String s = sb.toString();

                    int count = 1;

                    if (map.containsKey(s))
                    {
                        count = map.get(s) + 1;
                    }

                    map.put(s, count);

                    // Reset builder
                    sb.setLength(0);
                }
            }


        }

        // Handle potential last word (if needed)
        if (sb.length() > 0)
        {
            String s = sb.toString();
            
            int count = 1;
            
            if (map.containsKey(s))
            {
                count = map.get(s) + 1;
            }
            
            map.put(s,count);  
        }

        // Filter out banneds word and return word with highest frequency
        // Remove the banned words if they exists on hashmap
        for (String b : banned)
        {
            if (map.containsKey(b))
            {
                map.remove(b);
            }
        }

        // Get the max frequency
        int maxValue = Collections.max(map.values());
        String result = "";

        // Use the maxValue to find the corresponding word
        for (Map.Entry<String,Integer> entry : map.entrySet())
        {
            if (entry.getValue() == maxValue) 
            {
                result = entry.getKey();
                
                break;
            }  
        }



        return result;
        
        
    }
}