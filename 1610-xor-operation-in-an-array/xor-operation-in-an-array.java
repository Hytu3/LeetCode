class Solution 
{
    public int xorOperation(int n, int start) 
    {
        int[] nums = new int[n];

        // Build nums array
        for (int i = 0; i < n; i++)
        {
            nums[i] = start + 2 * i;
        }

        int bit = 0;
        
        // Traverse newly built array
        for (int i = 0; i < nums.length; i++)
        {
            // Build bitwise XOR of all elements
            bit ^= nums[i];
        }

        return bit;
    }
}