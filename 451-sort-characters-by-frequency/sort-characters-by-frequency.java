class Solution 
{
    public String frequencySort(String s) 
    {
        HashMap <Character, Integer> map = new HashMap<>();

        // Get each characters frequency
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);

            int count = 1;
            
            if (map.containsKey(c))
            {
                count = map.get(c) + 1;
            }

            map.put(c, count);
        }

        // Convert string to char array
        Character[] charArray = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) 
        {
            charArray[i] = s.charAt(i);
        }
        
        // Sort the array
        Arrays.sort(charArray, (a, b) -> {
        // Tie breaker goes to lexi order
        if (map.get(b).equals(map.get(a))) {
            return a.compareTo(b);
        }
        return map.get(b) - map.get(a);
        });


        // Convert Character[] back to char[]
        char[] resultArray = new char[charArray.length];
        
        for (int i = 0; i < charArray.length; i++) 
        {
            resultArray[i] = charArray[i];
        }

        // Build String
        String result = new String(resultArray);

        return result;


        
    }
}