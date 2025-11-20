class Solution 
{
    public List<List<Integer>> largeGroupPositions(String s) 
    {
        List<List<Integer>> outerList = new ArrayList<>();

        int start = 0;

        int end = 0;

        for (int i = 1; i < s.length(); i++)
        {
            
            int j = i - 1;

            char prev = s.charAt(j);
            
            char current = s.charAt(i);

            // Increment end if there is a repeating character
            if (current == prev)
            {
                end = i;
            }
            // Point of mismatch
            else
            {
                List<Integer> list = new ArrayList<>();
                
                
                if (end - start >= 2)
                {
                    list.add(start);
                    list.add(end);
                    outerList.add(list);
                }

                // Reset both to the index found at mismatch
                start = i;
                end = i;

            }
            
        }

        // If no mismatch was found at all still check for a group larger than 3
        if (end - start >= 2)
        {
            List<Integer> list = new ArrayList<>();
            list.add(start);
            list.add(end);
            outerList.add(list);

        }

        
        // Sort by start index
        outerList.sort((a,b) -> Collections.min(a) - Collections.min(b));


        return outerList;
        
    }
}