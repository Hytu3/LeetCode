class Solution 
{
    public int minOperations(String s) 
    {

        // Edge case
        if (s.length() == 1)
        {
            return 0;
        }

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        // Build sb1
        Boolean zero = true;
        Boolean one = false;
            
        for (int i = 0; i < s.length(); i++)
        {
            if (zero)
            {
                sb1.append('0');
                zero = false;
                one = true;
                continue;
            }

            if (one)
            {
                sb1.append('1');
                zero = true;
                one = false;
                continue;
            }
        }

        // Build sb2
        zero = false;
        one = true;
            
        for (int i = 0; i < s.length(); i++)
        {
            if (zero)
            {
                sb2.append('0');
                zero = false;
                one = true;
                continue;
            }

            if (one)
            {
                sb2.append('1');
                zero = true;
                one = false;
                continue;
            }
        }

        // Compare both stringbuilders to original string
        int diff1 = 0;
        int diff2 = 0;

        for (int i = 0; i < s.length(); i++)
        {
            char a = s.charAt(i);
            char b = sb1.charAt(i);
            char c = sb2.charAt(i);

            if (a != b)
            {
                diff1++;
            }

            if (a != c)
            {
                diff2++;
            }
        }

        int count = Math.min(diff1,diff2);

        return count;
    }
        
}