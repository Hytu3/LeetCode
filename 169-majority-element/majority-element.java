import java.util.HashMap;

class Solution 
{
    public int majorityElement(int[] nums) 
    {
        int Majelement = nums.length / 2; // The majority element
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

        // Find the element with a higher count than majority element
        for (int key : freqMap.keySet()) 
        {
            if (freqMap.get(key) > Majelement) 
            {
                return key; // Majority element found
            }
        }

        return -1; // If no majority element exists 
    }
}
