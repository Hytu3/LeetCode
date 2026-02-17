class Solution 
{
    public int countGoodTriplets(int[] arr, int a, int b, int c) 
    {
        int count = 0;
        
        // Keep track of each index and find the absolute values of differences to compare
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                for (int k = j + 1; k < arr.length; k++)
                {
                    int diff1 = arr[i] - arr[j];
                    int diff2 = arr[j] - arr[k];
                    int diff3 = arr[i] - arr[k];

                    int abs1 = Math.abs(diff1);
                    int abs2 = Math.abs(diff2);
                    int abs3 = Math.abs(diff3);

                    if (abs1 <= a && abs2 <=b && abs3 <= c)
                    {
                        count++;
                    }
                }
            }
        }

        return count;
        
    }
}