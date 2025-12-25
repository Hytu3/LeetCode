class Solution 
{
    public int maxDistinct(String s) 
    {
        // Add each unique character to a set
        Set <Character> set = new HashSet<>();

        for (char c : s.toCharArray())
        {
            set.add(c);
        }

        // Return number of unique characters
        return set.size();
        
    }
}