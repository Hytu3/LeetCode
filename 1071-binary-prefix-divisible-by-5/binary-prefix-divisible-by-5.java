class Solution 
{
    public List<Boolean> prefixesDivBy5(int[] nums) 
    {
        List<Boolean> list = new ArrayList<>();

        int number = 0;

        for (int num : nums)
        {
            // Number can either be 0 or 1
            if (num == 0)
            {
                number = (number * 2) % 5;
            }
            else
            {
                number = ((number * 2) + 1) % 5;
            }

            // Check divisibility
            if (number == 0)
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
