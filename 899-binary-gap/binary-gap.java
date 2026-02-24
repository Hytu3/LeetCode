class Solution 
{
    public int binaryGap(int n) 
    {
        int max = 0;

        String s = Integer.toBinaryString(n);

        int prev = -1;
        int current = -1;
        
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);

            if (c == '1')
            {
                if (prev == -1)
                {
                    current = i;
                    prev = i;
                }
                else
                {
                    current = i;
                }
                
                if (current - prev >= max)
                {
                    max = current - prev;
                }
            }

            prev = current;
        }

        return max;

        
    }
}