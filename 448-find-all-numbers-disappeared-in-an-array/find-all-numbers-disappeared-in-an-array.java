class Solution 
{
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        // Put all possible numbers from 1 to n in hashmap
        
        for (int i = 1; i <= n; i++)
        {
            map.put(i,0);
        }

        // If number is present in array increment its value
        
        for (int j = 0; j < nums.length; j++)
        {
            if(map.containsKey(nums[j]))
            {
                map.put(nums[j],(map.get(nums[j]) + 1));
            }
        }

        // Look for keys with values of zero which are dissappeared in array
        // Add them to an arraylist then return 

        List<Integer> keysWithZero = new ArrayList<>();
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
        {
            if (entry.getValue() == 0) 
            {
               keysWithZero.add(entry.getKey()); 
            }
        }

        return keysWithZero;

    }
}