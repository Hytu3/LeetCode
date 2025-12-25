class Solution 
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        // Find max

        int max = 0;

        List<Boolean> list = new ArrayList<>();

        for (int num : candies)
        {
            if (num >= max)
            {
                max = num;
            }
        }

        // Traverse again and check if each value + max is greater than max
        // If so add true to list
        // If not add false
        for (int num : candies)
        {
            if (num + extraCandies >= max)
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }
        }

        return list;
        
    }
}