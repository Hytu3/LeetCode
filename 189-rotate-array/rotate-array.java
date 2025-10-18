class Solution 
{
    public void rotate(int[] nums, int k) 
    {
        List<Integer> list = new ArrayList<>(Collections.nCopies(nums.length, 0));

        int carryLimit = nums.length;
        
        for (int i = 0; i < nums.length; i++)
        {
            int newIndex = (i + k) % nums.length;
            
            if (newIndex >= carryLimit)
            {
                newIndex = newIndex - carryLimit;
                list.set(newIndex, nums[i]);
            }
            
            if (newIndex < carryLimit)
            {
               list.set(newIndex, nums[i]); 
            }
            
        }

        for (int j = 0; j < nums.length; j++) 
        {
          nums[j] = list.get(j);
        }
        
    }
}