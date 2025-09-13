class Solution 
{
    public int findMaxConsecutiveOnes(int[] nums) 
    {

        int count = 0;
        
        List<Integer> list = new ArrayList<>();

        int maxVal = 0;

        for (int i = 0; i < nums.length; i++)
        {
          // Keep count of consecutive ones and place into list and reset count after 0 encountered
          
          if (nums[i] != 0)
          {
            count++;
          }
          else
          {
            list.add(count);
            count = 0;
          }

        }

        // Returns the last count of consecutive ones in an array
        list.add(count);

        // Return the max consecutive count
        
        for (int j = 0; j < list.size(); j++)
        {
            if (list.get(j) > maxVal) 
            {
                maxVal = list.get(j);
            }
        }

        return maxVal;
        
    }
}