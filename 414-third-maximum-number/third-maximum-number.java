class Solution 
{
    public int thirdMax(int[] nums) 
    {
        ArrayList<Integer> list = new ArrayList<>();

        // Add values only if not already in list (to ensure distinct)
        for (int num : nums) 
        {
            if (!list.contains(num)) 
            {
                list.add(num);
            }
        }

        // If less than 3 distinct values, return max
        if (list.size() < 3) 
        {
            int max = list.get(0);
            for (int i = 0; i < list.size(); i++) 
            {
                if (list.get(i) > max) 
                {
                    max = list.get(i);
                }
            }
            return max;
        }

        // First max
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) > max)
            {
                max = list.get(i);
            }
        }

        // Remove all occurrences of max
        for (int i = list.size() - 1; i >= 0; i--) 
        {
            if (list.get(i) == max) 
            {
                list.remove(i);
            }
        }

        // Second max
        int secondMax = list.get(0);
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) > secondMax)
            {
                secondMax = list.get(i);
            }
        }

        // Remove all occurrences of second max
        for (int i = list.size() - 1; i >= 0; i--) 
        {
            if (list.get(i) == secondMax) 
            {
                list.remove(i);
            }
        }

        // Third max
        int thirdMax = list.get(0);
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) > thirdMax)
            {
                thirdMax = list.get(i);
            }
        }

        return thirdMax;
    }
}

