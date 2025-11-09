class Solution 
{
    public List<String> stringMatching(String[] words) 
    {
        Set<String> set = new HashSet<>();

        int targetIndex = words.length - 1;

        while (targetIndex >= 0)
        {
            for (int i = 0; i < words.length; i++)
            {
                String s = words[i];

                String target = words[targetIndex];

                // If we are on the same index skip
                if (i == targetIndex)
                {
                    continue;
                }
                
                // Check for substring
                if (s.contains(target))
                {
                    // Add unique values
                    set.add(target);
                }                                
            }

            // Decrement target index
            targetIndex--;            
        }
        
        // Convert set to arrayList
        List<String> list = new ArrayList<>(set);

        
        return list;
        
    }
}