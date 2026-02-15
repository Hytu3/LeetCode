class Solution 
{
    public String[] sortPeople(String[] names, int[] heights) 
    {
        // Build hashmap
        HashMap <Integer,String> map = new HashMap<>();

        for (int i = 0; i < names.length; i++)
        {
            String s = names[i];

            int num = heights[i];           
            
            map.put(num,s);
        }

        // Sort heights
        Arrays.sort(heights);

        // Build result array
        String[] result = new String[names.length];
        
        int j = 0;
        
        for (int i = heights.length - 1; i >= 0; i--)
        {
            result[j] = map.get(heights[i]);

            j++;
        }

        return result;
        
    }
}