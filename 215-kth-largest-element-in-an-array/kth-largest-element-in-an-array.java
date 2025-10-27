class Solution 
{
    public int findKthLargest(int[] nums, int k) 
    {
        // Declare a max heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add elements into max heap
        for (int i = 0; i < nums.length; i++)
        {
            maxHeap.add(nums[i]);
        }

        // Remove all maxes before the kth largest element
        for (int x = 1; x < k; x++)
        {
            maxHeap.poll();
        }

        // Get the kth largest element
        int num = maxHeap.peek();

        return num;


        
    }
}