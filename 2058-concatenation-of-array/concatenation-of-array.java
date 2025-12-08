class Solution 
{
    public int[] getConcatenation(int[] nums) 
    {
        int length = nums.length;
        
        int[] result = new int[2 * length];

        for (int i = 0; i < nums.length; i++)
        {
            result[i] = nums[i];

            result[length + i] = nums[i];
        }

        return result;
        
    }
}