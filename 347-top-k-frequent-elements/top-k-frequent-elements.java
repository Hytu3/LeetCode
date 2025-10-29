class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Get the frequencies
        for (int num : nums)
        {
            int count = 1;
            
            if (map.containsKey(num))
            {
                count = map.get(num) + 1;
            }

            map.put(num, count);
        }

        // Min-heap of keys ordered by frequency (smallest frequency at top)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

        // Keep only k most frequent keys in the min-heap
        for (Integer key : map.keySet())
        {
            minHeap.offer(key);
            if (minHeap.size() > k)
            {
                minHeap.poll();
            }
        }

        // Extract k keys from heap into result array (order doesn't matter)
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--)  // fill from end if you want highest freq at start
        {
            result[i] = minHeap.poll();
        }

        return result;
    }
}
