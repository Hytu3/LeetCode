class Solution 
{
    public int[] getSneakyNumbers(int[] nums) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        int[] result = new int[2];
        
        // Get frequency counts
        for (int i = 0; i < nums.length; i++)
        {
            int count = 1;
            
            if (map.containsKey(nums[i]))
            {
                count = map.get(nums[i]) + 1;
            }

            map.put(nums[i], count);
        }

        // Find all 2 keys with frequency of 2 
        List <Integer> list = new ArrayList<>();
        
        for (Map.Entry <Integer,Integer> entry : map.entrySet())
        {
            if (entry.getValue() == 2)
            {
                list.add(entry.getKey());
            }
        }

        // Add them to array
        for (int j = 0; j < list.size(); j++)
        {
            result[j] = list.get(j);
        }

        return result;
    }
}