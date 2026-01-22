class Solution 
{
    public int minimumPairRemoval(int[] nums) 
    {
        int count = 0;

        // Convert array to list
        List <Integer> list = new ArrayList<>();
        
        for (int num : nums)
        {
            list.add(num);
        }

        
        while (! isNonDecreasing(list))
        {
            int min = Integer.MAX_VALUE;
            
            // Find min pair
            for (int i = 1; i < list.size(); i++)
            {
                int j = i - 1;

                if (list.get(j) + list.get(i) <= min)
                {
                    min = list.get(j) + list.get(i);
                }
            }

            // Find min pair (again)
            for (int i = 1; i < list.size(); i++)
            {
                int j = i - 1;

                // This time find the leftmost pair
                if (list.get(j) + list.get(i) == min)
                {
                    // Replace pair with sum
                    list.set(j, min);
                    list.remove(i);
                    break;
                }
            }

            count++;            
        }
        
        return count;
        
    }

    public Boolean isNonDecreasing (List<Integer> list)
    {
        for (int i = 1; i < list.size(); i++)
        {
            int j = i - 1;

            if (list.get(i) >= list.get(j))
            {
                continue;
            }
            else
            {
                return false;
            }
        }

        return true;
    }
}