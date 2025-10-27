class Solution 
{
    public int maxFreqSum(String s) 
    {
        HashMap <Character, Integer> map1 = new HashMap<>();

        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                int count = 1;
                
                if (map1.containsKey(c))
                {
                    count = map1.get(c) + 1;
                }

                map1.put(c,count);
            }
        }


        HashMap <Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);

            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')
            {
                int count = 1;
                
                if (map2.containsKey(c))
                {
                    count = map2.get(c) + 1;
                }

                map2.put(c,count);
            }
        }

        int vowelMax = 0;
        int nonvowelMax = 0;
        
        
        if (!map1.isEmpty())
        {
           vowelMax = Collections.max(map1.values());   
        }
        
        if (!map2.isEmpty())
        {
           nonvowelMax = Collections.max(map2.values());   
        }
        

        int sum = vowelMax + nonvowelMax;

        return sum;
        
    }
}