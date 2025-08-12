class Solution 
{
    public int calculate(String s) 
    {
        int[] nums = new int[s.length()];
        char[] ops = new char[s.length()];
        int numIndex = -1;
        int num = 0;
        char op = '+';

        for (int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            if (Character.isDigit(c)) 
            {
                num = num * 10 + (c - '0');
            }

            if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) 
            {
                if (op == '+') 
                {
                    nums[++numIndex] = num;
                } else if (op == '-') 
                {
                    nums[++numIndex] = -num;
                } else if (op == '*') 
                {
                    nums[numIndex] = nums[numIndex] * num;
                } else if (op == '/') 
                {
                    nums[numIndex] = nums[numIndex] / num;
                }
                op = c;
                num = 0;
            }
        }

        int result = 0;
        
        for (int i = 0; i <= numIndex; i++) 
        {
            result += nums[i];
        }

        return result;
    }

}