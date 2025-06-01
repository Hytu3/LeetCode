class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        // Declarations
        int [] indexArray = new int [2];

        int num1 = 0;

        int num2 = 0;

        // Use two pointers to traverse the array
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                num1 = nums[i];
                num2 = nums[j];

                // Check to see if the 2 numbers add up to target and if they are smaller than target individually
                if (num1 + num2 == target)
                {
                    // Add the indexes into the new array and return it
                    indexArray [0] = i;
                    indexArray [1] = j;
                }
            }
        }

        return indexArray;
        
    }
}