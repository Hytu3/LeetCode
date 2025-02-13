class Solution 
{
    public int missingNumber(int[] nums) 
    {
        int n = nums.length;
        int result = n; // Start with n (because n is the number that is missing in the array)

            // XOR all the elements in the array with their indices
            for (int i = 0; i < n; i++) 
            {
                result ^= i ^ nums[i];
            }

            return result;
    }

}