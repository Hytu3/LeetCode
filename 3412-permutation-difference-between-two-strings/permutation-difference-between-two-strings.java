class Solution 
{
    public int findPermutationDifference(String s, String t) 
    {
        int sum = 0;

        for (int i = 0; i < s.length(); i++)
        {
            // Find index where character from s is in t
            char c = s.charAt(i);
            
            for (int j = 0; j < t.length(); j++)
            {
                char d = t.charAt(j);

                if (c == d)
                {
                    // Add the absolute value of the difference of index of occurrence
                    int diff = j - i;

                    int num = Math.abs(diff);

                    sum += num;
                }
            }
        }

        return sum;
        
    }
}