class Solution 
{
    public int[] leftRightDifference(int[] nums) 
    {
        // Build left sum
        int[] left = new int[nums.length];

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++)
        {
            left[i] = leftSum;
            leftSum += nums[i];
        }

        // Build right sum
        int[] right = new int[nums.length];

        int rightSum = 0;

        for (int i = nums.length - 1; i >= 0; i--)
        {
            right[i] = rightSum;
            rightSum += nums[i];
        }

        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
        {
            int diff = left[i] - right[i];
            
            answer[i] = Math.abs(diff);
        }

        return answer;

        
    }
}