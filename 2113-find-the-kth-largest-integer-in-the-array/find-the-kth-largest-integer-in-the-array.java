class Solution 
{
    public String kthLargestNumber(String[] nums, int k) 
    {
        // Sort by length and if there is a tie set by lexi order
        Arrays.sort(nums, (a, b) -> 
        {
            if (a.length() != b.length()) 
            {
                return b.length() - a.length(); // longer first
            }
            return b.compareTo(a); // reverse lexicographic order
        });

        return nums[k - 1];
        
    }
}