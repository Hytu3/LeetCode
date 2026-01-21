class Solution 
{
    public List<Integer> stableMountains(int[] height, int threshold) 
    {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < height.length; i++)
        {
            int j = i - 1;

            if (height[j] > threshold)
            {
                list.add(i);
            }
        }

        return list;
        
    }
}