class Solution 
{
    public int dominantIndex(int[] nums) 
    {
        PriorityQueue <Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums)
        {
            maxHeap.offer(num);
        }

        int max = maxHeap.peek();

        int index = 0;

        for (int i = 0; i < nums.length; i++)
        {
            
            if (nums[i] == max)
            {
                index = i;
                continue;
            }
            
            
            if (max >= (nums[i] * 2))
            {
                continue;
            }
            else
            {
                return -1;
            }
        }

        return index;
        
    }
}