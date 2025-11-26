class Solution 
{
    public int[] replaceElements(int[] arr) 
    {
        int[] replace = new int[arr.length];

        int max = 0;

        // Traverse array backwards
        for (int i = arr.length - 1; i >= 0; i--)
        {
            // MaxHeap will be empty only on the first index
            if (max == 0)
            {
                replace[i] = -1;

                // Throw the initial value into maxHeap
                max = arr[i];

            }
            // Every other case
            else
            {
                // Get the current max
                replace[i] = max;

                // Check for a new max
                if (arr[i] > max)
                {
                    max = arr[i];
                }

            }
        }

        return replace;
            
        
    }
}