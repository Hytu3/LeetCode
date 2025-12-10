class Solution 
{
    public int numJewelsInStones(String jewels, String stones) 
    {
        Set <Character> set = new HashSet<>();

        int count = 0;

        // Put all jewels into set
        for (char c : jewels.toCharArray())
        {
            set.add(c);
        }

        // Traverse stones
        for (char c : stones.toCharArray())
        {
            if (set.contains(c))
            {
                count++;
            }
        }

        return count;
        
    }
}