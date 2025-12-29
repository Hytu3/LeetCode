class Solution 
{
    public int minimumBoxes(int[] apple, int[] capacity) 
    {
        // Get total amount of apples
        int sum = 0;

        for (int i = 0; i < apple.length; i++)
        {
            sum += apple[i];
        }

        // Sort capacity array to start with the biggest capacity boxes
        Arrays.sort(capacity);
        
        int count = 0;

        int boxSum = 0;

        // Find which box capacity can distribute all apples
        // Traverse backwards
        for (int i = capacity.length - 1; i >= 0; i--)
        {
            count++;

            boxSum += capacity[i];

            if (boxSum >= sum)
            {
                break;
            }
        }

        return count;
        
    }
}