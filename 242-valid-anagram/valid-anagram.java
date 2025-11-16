class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        HashMap <Character, Integer> map1 = new HashMap<>();

        HashMap <Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++)
        {
            char x = s.charAt(i);

            int count = 1;

            if (map1.containsKey(x))
            {
                count = map1.get(x) + 1;
            }

            map1.put(x,count);

        }


        for (int j = 0; j < t.length(); j++)
        {
            char y = t.charAt(j);

            int count = 1;

            if (map2.containsKey(y))
            {
                count = map2.get(y) + 1;
            }

            map2.put(y, count);
            
        }

        // Compare maps
        if (map1.equals(map2))
        {
            return true;
        }

        return false;


        
    }
}