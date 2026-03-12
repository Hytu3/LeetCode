class Solution 
{
    public int bitwiseComplement(int n) 
    {
        // Get binary string
        String s = Integer.toBinaryString(n);

        StringBuilder sb = new StringBuilder();

        // Flip bits
        for (char c : s.toCharArray())
        {
            if (c == '0')
            {
                sb.append('1');
            }

            if (c == '1')
            {
                sb.append('0');
            }
        }

        int complement = 0;

        int num = 1;
        
        // Traverse stringbuilder in reverse
        for (int i = sb.length() - 1; i >= 0; i--)
        {
            char c = sb.charAt(i);

            if (c == '1')
            {
                complement += num;
            }

            num = num * 2;
        }

        // Return answer
        return complement;


        
    }
}