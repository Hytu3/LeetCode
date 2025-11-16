class Solution 
{
    public int getCommon(int[] nums1, int[] nums2) 
    {
        PriorityQueue <Integer> minHeap = new PriorityQueue<>();

        Set <Integer> set1 = new HashSet<>();

        Set <Integer> set2 = new HashSet<>();
        
        
        for (int num : nums1)
        {
            minHeap.offer(num);
            set1.add(num);
        }

        for (int num : nums2)
        {
            minHeap.offer(num);
            set2.add(num);
        }

        int min = -1;
        
        while (!minHeap.isEmpty())
        {
             int searchVal = minHeap.poll();

             if (set1.contains(searchVal) && set2.contains(searchVal))
             {
                min = searchVal;
                break;
             }

        }

        return min;

        
    }
}