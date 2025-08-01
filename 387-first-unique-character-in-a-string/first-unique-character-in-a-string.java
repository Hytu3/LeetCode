class Solution 
{
    public int firstUniqChar(String s) 
    {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequencies
        for (int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Find first character with frequency == 1
        for (int i = 0; i < s.length(); i++) 
        {
            if (map.get(s.charAt(i)) == 1) 
            {
                return i;
            }
        }

        return -1;
    }
}
