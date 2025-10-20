class Solution 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        // Array size
        int n = nums.length;

        // Target frequency to check
        int targetFreq = n / 3;

        // Store all frequencies in a hashmap
        HashMap<Integer,Integer> map = new HashMap<>();

        // Final list to store all elements that appear more than n/3 times (target frequency)
        List<Integer> list = new ArrayList<>();
        
        for (int number : nums)
        {
            int count = 1;
            
            if (map.containsKey(number))
            {
                count = map.get(number) + 1;
            }

            map.put(number,count);
        }

        // Go through each entry in map and add key to list the frequencies above n / 3
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if (entry.getValue() > targetFreq)
            {
                list.add(entry.getKey());
            }            
        }
        
        return list;
   
    }
}