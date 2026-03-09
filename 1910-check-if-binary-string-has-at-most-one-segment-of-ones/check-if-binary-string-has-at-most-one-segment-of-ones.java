class Solution 
{
    public boolean checkOnesSegment(String s) 
    {
        // Build a list of ones index occurences
        List<Integer> list = new ArrayList<>();

        int index = 0;

        for (char c : s.toCharArray())
        {
            if (c == '1')
            {
                list.add(index);
            }

            index++;
        }

        // Only one occurrence of 1 which means true
        if (list.size() == 1)
        {
            return true;
        }
        
        // Traverse index list
        for (int i = 1; i < list.size(); i++)
        {
            int j = i - 1;

            int diff = list.get(i) - list.get(j);

            // Non contiguous if diff is greater than 1
            if (diff > 1)
            {
                return false;
            }
        }

        return true;
        
    }
}