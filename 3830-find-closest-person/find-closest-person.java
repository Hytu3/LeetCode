class Solution 
{
    public int findClosest(int x, int y, int z) 
    {
        int result = 0;
        
        int dif1 = Math.abs(z - x);

        int dif2 = Math.abs(z - y);

        if (dif1 > dif2)
        {
            result = 2;
        }
        
        if (dif2 > dif1)
        {
            result = 1;
        }

        return result;
        
    }
}