class Solution 
{
    public boolean isAlienSorted(String[] words, String order) 
    {
        // Put order into a hashmap giving each char an increasing value
        HashMap <Character,Integer> map = new HashMap<>();
        
        int count = 1;

        for (int i = 0; i < order.length(); i++)
        {
            char c = order.charAt(i);

            map.put(c, count);

            count++;
        }

        // Traverse the words array and compare pairs order by order
        for (int i = 1; i < words.length; i++)
        {
            int j = i - 1;

            String x = words[j];

            String y = words[i];

            int length = Math.min(x.length(), y.length());

            Boolean traversed = false;

            for (int k = 0; k < length; k++)
            {
                char c = x.charAt(k);

                char d = y.charAt(k);

                if (map.get(c) == map.get(d))
                {

                    // If we are at the end and they all equaled set the flag to true
                    if (k == length - 1)
                    {
                        traversed = true;
                    }

                    continue;        
                }

                if (map.get(c) > map.get(d))
                {
                    return false;        
                }

                // Expected behavior
                if (map.get(c) < map.get(d))
                {
                    break;
                }
            }

            if (traversed)
            {
                if (x.length() > y.length())
                {
                    return false;
                }
            }
        }

        return true;
        
    }
}