class Solution 
{
    public int sumOfMultiples(int n) 
    {
        int sum = 0;

        int[] array = new int[n+1];

        // Create an array
        for (int i = 0; i < array.length; i++)
        {
            array[i] = i;
        }

        // Traverse through create array and check for numbers divisible and add to sum
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 3 == 0 || array[i] % 5 == 0 || array[i] % 7 == 0)
            {
                sum += array[i];
            }
        }

        return sum;
        
    }
}