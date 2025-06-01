class Solution 
{
    public boolean isPerfectSquare(int num) 
    {
        int smallNum = 1;

        while (smallNum < 46341)
        {
            if (smallNum * smallNum == num)
            {
                return true;
            }

            smallNum++;
        }

        return false;



        
    }
}