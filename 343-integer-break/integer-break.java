class Solution 
{
    public int integerBreak(int n) 
    {
        if (n == 2)
        {
            return 1;
        }

        if (n == 3)
        {
            return 2;
        }
        
        PriorityQueue <Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int divisor = 2;

        while ( (double) (n / divisor) > 1)
        {
            int count = divisor;
            
            int remainder = n % divisor;

            int product = 1;

            while (count > 0)
            {
                int multiple = n / divisor;

                if (remainder > 0)
                {
                    multiple += 1;
                }
                
                
                product *= multiple;

                count--;

                remainder--;

            }

            // Throw product into maxHeap
            maxHeap.offer(product);
            
            divisor++;


        }

        return maxHeap.peek();
        
    }
}