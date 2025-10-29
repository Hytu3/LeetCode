class Solution 
{
    public int maximum69Number (int num) 
    {
        String sNum = Integer.toString(num);

        StringBuilder sb = new StringBuilder(sNum);

        for (int i = 0; i < sb.length(); i++)
        {
            char c = sb.charAt(i);

            // First 6 encountered is the one that needs to be changed
            if (c == '6')
            {
                sb.setCharAt(i, '9');
                break;
            }
        }

        String result = sb.toString();

        int max = Integer.parseInt(result);

        return max;
        
    }
}