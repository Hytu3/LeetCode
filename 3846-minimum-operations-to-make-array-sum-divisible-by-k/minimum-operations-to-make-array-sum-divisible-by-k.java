class Solution 
{
    public int minOperations(int[] nums, int k) 
    {
        int count = 0;

        int sum = 0;

        for (int number : nums)
        {
            sum += number;
        }

        while (sum % k != 0)
        {
            count++;
            sum--;
        }

        return count;
        
    }
}