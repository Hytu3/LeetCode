class Solution 
{
    public int arrangeCoins(int n) 
    {
        int numRows = 1;    

        int rowSize = 1;

        while (n >= 0)
        {
           // If row cant be completed
           if (n - rowSize < 0)
           {
             --numRows;
             break;
           } 
            
            n = n - rowSize;
            rowSize++;
            numRows++;
        }

        return numRows;
        
    }
}