class Solution 
{
    public int findKthLargest(int[] nums, int k) 
    {
        Arrays.sort(nums);

        int targetIndex = nums.length - k;

        return nums[targetIndex];
        
    }
}