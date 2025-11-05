class Solution 
{
    public int hIndex(int[] citations) 
    {
        
        // Edge case: Zero papers published zero times
        if (citations.length == 0)
        {
            return 0;
        }

        // Edge case: One paper published zero times
        if (citations.length == 1 && citations[0] == 0)
        {
            return 0;
        }
        
        
        // Declare a max heap
        PriorityQueue <Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int hIndex = 0;
        
        // Run a for loop between 0 and citations size
        while (hIndex <= citations.length)
        {
            int count = 0;
            
            // Traverse array 
            for (int j = 0; j < citations.length; j++)
            {
                if (citations[j] >= hIndex)
                {
                    count++;
                }                
            }

            if (count >= hIndex)
            {
                maxHeap.offer(hIndex);
            }

            hIndex++;
        }

        // Return maximum value of h
        return maxHeap.peek();
        
        
    }
}