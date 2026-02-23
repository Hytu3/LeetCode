class Solution 
{
    public boolean hasAllCodes(String s, int k) 
    {
        // Set will store all unique combinations
        Set <String> set = new HashSet<>();
        
        // Used fixed sliding window to check for combinations
        for (int i = k - 1; i < s.length(); i++)
        {
            StringBuilder sb = new StringBuilder();

            for (int j = i - (k - 1); j <= i; j++)
            {
                char c = s.charAt(j);

                sb.append(c);
            }

            set.add(sb.toString());


        }

        // Number of combinations to check
        int target = (int) Math.pow(2,k);

        // If all number of combinationss were met
        if (set.size() == target)
        {
            return true;
        }
        
        
        return false;

        
    }

}