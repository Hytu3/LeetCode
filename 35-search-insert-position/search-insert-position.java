class Solution 
{
    public int searchInsert(int[] nums, int target) 
    {
       for (int i = 0; i < nums.length; i++)
       {
         if (nums[i] == target)
         {
            return i; //Returns index of target found
         }
         else //If target is not found
         {
            if (nums[i] >= target)
            {
                return (i + (i + 1)) / 2;
            }
            
         }
       }
       // If target is larger than any array value
       return nums.length; 
    }
}