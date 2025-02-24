class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        // Create a hash map to keep track id how many times a value appears
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Count occurrences of each value
        for (int i = 0; i < nums.length; i++) 
        {  
            if (freqMap.containsKey(nums[i])) 
            {
                // If array has a repeated value the key is the same but the value increments by 1 to keep track of occurences
                freqMap.put(nums[i], freqMap.get(nums[i]) + 1);
            } else 
            {
                // If value isnt repeated yet in the array add it into the hashmap
                freqMap.put(nums[i], 1);
            }
        }

        // Find the value that appears twice
        for (int key : freqMap.keySet()) 
        {
            if (freqMap.get(key) >= 2) 
            {
                return true; // Value appears at least twice
            }
        }

        //If no value appears at least twice return false
        return false;
        
    }
}