class Solution 
{
    public String interpret(String command) 
    {
        // Variable to track last character found
        char lastChar = '0';

        StringBuilder sb = new StringBuilder();

        for (char c : command.toCharArray())
        {
            if (c == 'G')
            {
                sb.append('G');
                lastChar = 'G';
                continue;
            }

            if (c == '(')
            {
                lastChar = '(';
                continue;
            }

            if (c == ')')
            {
                 if (lastChar == '(')
                 {
                    sb.append('o');
                    continue;
                 }
                 else
                 {
                    continue;
                 }
            }

            if (c == 'a')
            {
                sb.append('a');
                lastChar = 'a';
                continue;
            }

            if (c == 'l')
            {
                sb.append('l');
                lastChar = 'l';
                continue;
            }
        }

        return sb.toString();
        
    }
}