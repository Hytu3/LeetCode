class Solution 
{
    public int findLucky(int[] arr) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse through the array
        for (int i = 0; i < arr.length; i++)
        {
            if (map.containsKey(arr[i]))
            {
                int currentCount = map.get(arr[i]);
                map.put(arr[i], currentCount + 1);  // Increment existing count
            }
            else
            {
                map.put(arr[i], 1);  // Insert value with count = 1
            }
        }

        int maxLucky = -1;

        // Check all key-value entries to find the highest matching lucky integer
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            int num = entry.getKey();
            int frequency = entry.getValue();

            if (num == frequency)
            {
                if (num > maxLucky)
                {
                    maxLucky = num;  // Track largest lucky integer
                }
            }
        }

        return maxLucky;
    }
}
