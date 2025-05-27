class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        // Arrays to hold non-zero and zero values
        int[] array = new int[nums.length];
        int[] zeroArray = new int[nums.length];

        int nonZeroIndex = 0;
        int zeroIndex = 0;

        // Fill array and zeroArray based on nums
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != 0)
            {
                array[nonZeroIndex++] = nums[i];
            }
            else
            {
                zeroArray[zeroIndex++] = nums[i];
            }
        }

        // Create the combined array
        int[] combinedArray = new int[nums.length];
        int combinedIndex = 0;

        // First add all non-zero elements
        for (int i = 0; i < nonZeroIndex; i++) {
            combinedArray[combinedIndex++] = array[i];
        }

        // Then add all zero elements
        for (int i = 0; i < zeroIndex; i++) {
            combinedArray[combinedIndex++] = zeroArray[i];
        }

        //  Copy the result back to nums 
        for (int i = 0; i < nums.length; i++) {
            nums[i] = combinedArray[i];
        }
    }
}
