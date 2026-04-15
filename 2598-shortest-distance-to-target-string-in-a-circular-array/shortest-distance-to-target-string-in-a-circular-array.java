class Solution 
{
    public int closestTarget(String[] words, String target, int startIndex) 
    {
        List<Integer> indexes = new ArrayList<>();
        
        // Find the index / indexes in a target array

        int index = 0;
        
        for (String s : words)
        {
            if (s.equals(target))
            {
                indexes.add(index);
            }

            index++;
        }

        // If target is found
        if (indexes.isEmpty())
        {
            return -1;
        }

        int min = Integer.MAX_VALUE;

        for (int idx : indexes)
        {
            int left = 0;

            int right = 0;

            if (idx > startIndex)
            {
                left = idx - startIndex;
                right = words.length - left;
            }

            if (idx < startIndex)
            {
                left = startIndex - idx;
                right = words.length - left;
            }

            int dist = Math.min(left,right);

            if (dist <= min)
            {
                min = dist;
            }
            
        }

        return min;
        
    }
}