class Solution 
{
    public int maxFrequencyElements(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) 
        {
            int count = 1; 
            
            if (map.containsKey(nums[i])) 
            {
                count = map.get(nums[i]) + 1; // Get existing count, then increment
            }
            map.put(nums[i], count);
        }

        int maxValue = Collections.max(map.values());

        // Now find each element in array that has maxValue as they key and return it.

        int maxfreqCount = 0;

        
        // Go through each entry in map and see where max val is present
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
        {
            Integer value = entry.getValue();
            
            if (value == maxValue)
            {
                maxfreqCount += value;  // add the frequency, not just +1
            }
        }


        return maxfreqCount;
    }    

}