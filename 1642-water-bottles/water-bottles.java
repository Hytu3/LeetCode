class Solution 
{
    public int numWaterBottles(int numBottles, int numExchange) 
    {
        int sum = 0;
        sum = numBottles;


        while (numBottles > 0)
        {
            int add = numBottles / numExchange;
            sum += add;
            
            if (add == 0)
            {
               break;  
            }
            
            int remainder = numBottles % numExchange;
            numBottles = numBottles / numExchange;
            numBottles += remainder;

        }

        return sum;
        
    }
}