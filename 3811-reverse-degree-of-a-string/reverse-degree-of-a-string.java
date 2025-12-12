class Solution 
{
    public int reverseDegree(String s) 
    {
        int sum = 0;

        int value = 26;

        HashMap <Character, Integer> map = new HashMap<>(); 

        // Create HashMap
        for (char c = 'a'; c <= 'z'; c++)
        {
            map.put(c, value);
            value--;
        }

        int index = 1;
        
        for (char x : s.toCharArray())
        {
            int product = index * map.get(x);

            sum += product;

            index++;
        }

        return sum;
        
    }
}