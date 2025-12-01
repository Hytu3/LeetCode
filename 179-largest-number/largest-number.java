class Solution 
{
    public String largestNumber(int[] nums) 
    {
        // Convert to String array
        String[] arr = new String[nums.length];
        
        for (int i = 0; i < nums.length; i++)
        {
            arr[i] = Integer.toString(nums[i]);
        }

        // Custom sort by comparing which concatenation is larger 
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // If 0 is the biggest element after sort solution must be zero
        if (arr[0].equals("0"))
        {
            return "0";
        }

        // Build result
        
        StringBuilder sb = new StringBuilder();
        
        for (String s : arr)
        {
            sb.append(s);
        }

        return sb.toString();
    }
}
