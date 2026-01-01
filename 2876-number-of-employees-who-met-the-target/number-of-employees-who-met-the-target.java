class Solution 
{
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) 
    {
        // Number of employees who met target
        int count = 0;

        for (int num : hours)
        {
            if (num >= target)
            {
                count++;
            }
        }

        return count;


        
    }
}