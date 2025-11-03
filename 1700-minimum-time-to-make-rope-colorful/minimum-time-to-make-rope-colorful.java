class Solution 
{
    public int minCost(String colors, int[] neededTime) 
    {
        int minCost = 0;

        StringBuilder sb = new StringBuilder(colors);

        List<Integer> list = Arrays.stream(neededTime)
                           .boxed()
                           .collect(Collectors.toList());
        
        
        // Run through both array and string the same time since they are the same length
        for (int i = 1; i < sb.length(); i++)
        {
            int j = i - 1;
            
            char current = sb.charAt(i);

            char prev = sb.charAt(j);

            // If there is two consecutive colored balloons
            if (prev == current)
            {
                // Return the one with a smaller cost
                int minVal = Math.min(list.get(i),list.get(j));

                minCost += minVal;
                
            
                // Logic to determine what character is deleted
                if (list.get(i) <= list.get(j))
                {
                    sb.deleteCharAt(i);
                    list.remove(i);                   
                }
                else
                {
                    sb.deleteCharAt(j);
                    list.remove(j);                     
                }

                // Decrement index to avoid any error
                i = i - 1;
                
            }
        }


        // Return minCost
        return minCost;
        
    }
}