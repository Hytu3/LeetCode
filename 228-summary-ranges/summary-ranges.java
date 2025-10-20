class Solution 
{
    public List<String> summaryRanges(int[] nums) 
    {
       List<String> list = new ArrayList<>();

       // Handle edge case of empty array
       if (nums.length == 0) 
       {
         return new ArrayList<>();
       }

       // Use StringBuilder to build each range
       StringBuilder sb1 = new StringBuilder();

       for (int j = 0; j < nums.length; j++)
       {
            // Always start the range with the current number
            if (sb1.length() == 0)
            {
                sb1.append(nums[j]);
            }

            // Check if next number continues the range
            if (j == nums.length - 1 || nums[j + 1] != nums[j] + 1)
            {
                // If range has more than one number
                if (Integer.parseInt(sb1.toString()) != nums[j])
                {
                    sb1.append("->").append(nums[j]);
                }

                // Add range to list
                list.add(sb1.toString());

                // Reset builder for next range
                sb1.setLength(0);
            }
       }

       return list; 
    }
}
