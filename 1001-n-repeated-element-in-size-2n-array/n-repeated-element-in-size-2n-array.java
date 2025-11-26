class Solution 
{
    public int repeatedNTimes(int[] nums) 
    {
        int n = nums.length / 2;

        HashMap <Integer,Integer> map = new HashMap<>();

        // Frequency count
        for (int i = 0; i < nums.length; i++)
        {
            int count = 1;

            if (map.containsKey(nums[i]))
            {
                count = map.get(nums[i]) + 1;
            }

            map.put(nums[i], count);
        }

        int answer = 0;
        
        for (Map.Entry <Integer,Integer> entry : map.entrySet())
        {
            // Find element that appears n times
            if (entry.getValue() == n)
            {
                answer = entry.getKey();      
            }
        }

        // Return element
        return answer;
        
    }
}