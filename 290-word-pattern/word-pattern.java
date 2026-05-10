class Solution 
{
    public boolean wordPattern(String pattern, String s) 
    {
        
        String[] words = s.split(" ");

        char[] chars = pattern.toCharArray();

        // Check length indicator
        if (chars.length != words.length)
        {
            return false;
        }

        // Build hashmap
        HashMap<Character,String> map = new HashMap<>();
        
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];

            String str = words[i];

            map.put(c,str);

        }

        // Check for duplicate values which arent allowed
        Set<String> set = new HashSet<>();

        for (String strng : map.values())
        {
            if (set.contains(strng))
            {
                return false;
            }

            set.add(strng);
        }

        // Check for bijections
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];

            String str = words[i];

            if (!str.equals(map.get(c)))
            {
                return false;
            }

        }

        return true;
    }
}