class Solution 
{
    public int[] pivotArray(int[] nums, int pivot) 
    {
        List <Integer> list = new ArrayList<>();

        // Find all elements less than pivot
        for (int number : nums)
        {
            if (number < pivot)
            {
                list.add(number);
            }
        }

        // Find all elements equal to pivot
        for (int number : nums)
        {
            if (number == pivot)
            {
                list.add(number);
            }
        }

        // Find all elements greater than pivot
        for (int number : nums)
        {
            if (number > pivot)
            {
                list.add(number);
            }
        }

        // Convert back to nums
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = list.get(i);
        }

        return nums;
        
    }
}