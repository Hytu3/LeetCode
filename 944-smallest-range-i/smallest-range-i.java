class Solution 
{
    public int smallestRangeI(int[] nums, int k) 
    {
        // Edge case
        if (nums.length == 1)
        {
            return 0;
        }
        
        
        // Sort array
        Arrays.sort(nums);

        
        // Max minus min
        int diff = nums[nums.length - 1] - nums[0];

        int answer = 0;

        if (diff <= (k * 2))
        {
            return 0;
        }
        else
        {
            answer = diff - (k * 2);
        }

        return answer;

        
    }
}