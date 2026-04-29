class Solution 
{
    public int furthestDistanceFromOrigin(String moves) 
    {

        int dist = 0;

        int rCount = 0;
        int lCount = 0;
        int count = 0;
        
        for (char c : moves.toCharArray())
        {
            if (c == 'L')
            {
                dist--;
                lCount++;
            }

            if (c == 'R')
            {
                dist++;
                rCount++;
            }

            if (c == '_')
            {
                count++;   
            }
        }

        if (lCount >= rCount)
        {
            dist -= count;
        }

        if (lCount < rCount)
        {
            dist += count;
        }

        return Math.abs(dist);
        
    }
}