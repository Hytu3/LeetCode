class Solution 
{
    public int countOdds(int low, int high) 
    {
        int count = 0;

        // If both are even
        if (low % 2 == 0 && high % 2 == 0)
        {
            // If they are equal to each other
            if (low == high)
            {
                return 0;
            }
            
            return count + ((high - low) / 2);
            
        }
        
        
        // If both are odd
        if (low % 2 != 0 && high % 2 != 0)
        {
            // If they are equal to each other
            if (low == high)
            {
                return 1;
            }
            
            count  = count + 2;
            high = high - 1;
            low = low + 1;
            return count + ((high - low) / 2);
            
        }

        // If only low is odd
        if (low % 2 != 0 && high % 2 == 0)
        {
            count++;
            low = low + 1;
            return count + ((high - low) / 2);
        }

        // If only high is odd
        if (low % 2 == 0 && high % 2 != 0)
        {
            count++;
            high = high - 1;
            return count + ((high - low) / 2);
        }

        
        return count + ((high - low) / 2);
        
    }
}