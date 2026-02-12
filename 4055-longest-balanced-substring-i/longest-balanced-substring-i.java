class Solution 
{
    public int longestBalanced(String s) 
    {
        int max = 0;
        
        for (int i = 0; i < s.length(); i++)
        {
            int length = 1;

            HashMap <Character,Integer> map = new HashMap<>();

            char c = s.charAt(i);

            map.put(c,1);
            
            for (int j = i + 1; j < s.length(); j++)
            {
                length++;

                char d = s.charAt(j);

                if (map.containsKey(d))
                {
                    int count = map.get(d);
                    
                    map.put(d,count + 1);
                }
                else
                {
                    map.put(d,1);
                }

                // Check if frequencies are all the same
                // Max and min should be the same 
                int maxVal = Collections.max(map.values());
                int minVal = Collections.min(map.values());

                // Find longest length of balanced substring
                if (maxVal == minVal)
                {
                    if (length >= max)
                    {
                        max = length;
                    }
                }

            }

            // Check if frequencies are all the same after inner loop
            // Max and min should be the same 
            int maxVal = Collections.max(map.values());
            int minVal = Collections.min(map.values());

            // Find longest length of balanced substring
            if (maxVal == minVal)
            {
                if (length >= max)
                {
                    max = length;
                }
            }
        }

        return max;
        
    }
}