class Solution 
{
    public int rotatedDigits(int n) 
    {
        int count = 0;
        
        
        for (int i = 1; i <= n; i++)
        {
            StringBuilder sb = new StringBuilder();
            
            // Convert number to string
            String num = Integer.toString(i);

            Boolean isGoodNum = true;
            
            // Traverse string
            for (int j = 0; j < num.length(); j++)
            {
                
                char c = num.charAt(j);

                if (i <= 10)
                {
                    // If any other digit that is present is not these digits it cant be a good number
                    if (c != '2' && c != '5' && c != '6' && c != '9')
                    {
                        isGoodNum = false;
                        break;
                    }
                }
                // For double digit numbers 0,1,8 can be used for valid rotation 
                else
                {
                    // Number that contains any of these are automatically false
                    if (c == '3' || c == '4' || c == '7')
                    {
                        isGoodNum = false;
                        break;
                    }
                    else
                    {
                        if (c == '0')
                        {
                            sb.append('0');
                        }
                        
                        
                        if (c == '1')
                        {
                            sb.append('1');
                        }

                        if (c == '2')
                        {
                            sb.append('5');
                        }

                        if (c == '5')
                        {
                            sb.append('2');
                        }

                        if (c == '6')
                        {
                            sb.append('9');
                        }

                        if (c == '8')
                        {
                            sb.append('8');
                        }

                    }
                }

            }

            // After string is traversed check if string is the same as sb
            if (num.equals(sb.toString()))
            {
                isGoodNum = false;
            }

            // Final check to determine if it is a good num
            if (isGoodNum)
            {
                count++;
            }
        }

        return count;
        
    }
}