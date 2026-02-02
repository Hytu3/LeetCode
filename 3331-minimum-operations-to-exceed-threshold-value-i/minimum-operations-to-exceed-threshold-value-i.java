class Solution 
{
    public int minOperations(int[] nums, int k) 
    {
        // Use priority queue to keep track of smallest integers
        PriorityQueue <Integer> heap = new PriorityQueue<>();

        int count = 0;

        for (int num : nums)
        {
            heap.offer(num);
        }

        while (!heap.isEmpty())
        {
            
            // If threshold is exceeded
            if (k <= heap.poll())
            {
                break;
            }

            count++;

        }

        return count;
        
    }
}