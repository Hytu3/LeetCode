class Solution 
{
    public int singleNumber(int[] nums) 
    {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Count occurrences of each element
        for (int i = 0; i < nums.length; i++) 
        {  
            if (freqMap.containsKey(nums[i])) 
            {
                freqMap.put(nums[i], freqMap.get(nums[i]) + 1);
            } else 
            {
                freqMap.put(nums[i], 1);
            }
        }

        // Find the element that appears once
        for (int key : freqMap.keySet()) 
        {
            if (freqMap.get(key) == 1) 
            {
                return key; // Element found with count of 1
            }
        }
       return -1; 
    }
}