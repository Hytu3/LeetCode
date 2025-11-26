class Solution 
{
    public int[] replaceElements(int[] arr) 
    {
        int[] replace = new int[arr.length];

        PriorityQueue <Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Traverse array backwards
        for (int i = arr.length - 1; i >= 0; i--)
        {
            // MaxHeap will be empty only on the first index
            if (maxHeap.isEmpty())
            {
                replace[i] = -1;

                // Throw the initial value into maxHeap
                maxHeap.offer(arr[i]);

            }
            // Every other case
            else
            {
                // Get the current max
                replace[i] = maxHeap.peek();

                // Throw the current value into maxHeap
                maxHeap.offer(arr[i]);

            }
        }

        return replace;
            
        
    }
}