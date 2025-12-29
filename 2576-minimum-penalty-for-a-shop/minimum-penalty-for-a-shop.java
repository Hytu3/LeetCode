class Solution 
{
    public int bestClosingTime(String customers) 
    {
        // Use linked hashmap to keep track of order
        LinkedHashMap <Integer,Integer> map = new LinkedHashMap<>();
        
        // Get the totals for each letter
        int yTotal = 0;

        for (char c : customers.toCharArray())
        {
            if (c == 'Y')
            {
                yTotal++;
            }

        }

        // Get each hour / penalty pair if store were to close
        
        int hour = 0;
        
        int penalty = yTotal;

        map.put(hour,penalty);

        // Traverse string again and calculate the penalty if closed at each index
        for (int i = 0; i < customers.length(); i++)
        {
            hour++;
            
            char c = customers.charAt(i);

            if (c == 'Y')
            {
                penalty--;
            }

            if (c == 'N')
            {
                penalty++;
            }

            // Store hour and penalty pair
            map.put(hour,penalty);


        }

        // Find smallest penalty
        int min = Collections.min(map.values());

        int smallestHour = 0;

        // Traverse each entry
        for (Map.Entry <Integer, Integer> entry : map.entrySet())
        {
            if (entry.getValue() == min)
            {
                // First hour with smallest penalty gets returned
                smallestHour = entry.getKey();
                break;
            }
        }

        return smallestHour;
        
    }
}