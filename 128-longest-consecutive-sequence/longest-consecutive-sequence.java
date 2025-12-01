class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        TreeSet <Integer> set = new TreeSet<>();
        
        for (int number : nums)
        {
            set.add(number);
        }

        int count = 1;

        int max = 0;

        for (int num : set) 
        {
            if (set.contains(num + 1))
            {
                count++;
            }
            // Reset count
            else
            {
                count = 1;
            }

            // Max checker
            if (count >= max)
            {
                max = count;
            }
        }


        return max;


        
    }
}