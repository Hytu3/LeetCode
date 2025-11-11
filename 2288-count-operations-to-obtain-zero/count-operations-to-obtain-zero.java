class Solution 
{
    public static int count = 0;
    
    public int countOperations(int num1, int num2) 
    {
        count = 0;

        count = helper(num1, num2);

        return count;
        
    }

    public int helper(int num1, int num2) 
    {
        
        if (num1 == 0 || num2 == 0)
        {
            return count;
        }

        count++;

        if (num1 >= num2)
        {
            return helper(num1 - num2, num2);
        }
        else
        {
            return helper(num1, num2 - num1);
        }

        
    }
}