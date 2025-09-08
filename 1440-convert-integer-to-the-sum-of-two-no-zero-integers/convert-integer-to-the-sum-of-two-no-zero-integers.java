class Solution 
{
    public int[] getNoZeroIntegers(int n) 
    {
       int num1 = 0;

       int num2 = 0;
       
       for (int i = 0; i < n; i++)
       {
        
        num1 = i;

        if (checkNum(num1))
        {
            num2 = n - num1;

            if (checkNum(num2))
            {
                return new int[]{num1, num2};
            }
        }


       }

       return new int[]{};
    }

    public boolean checkNum(int number)
    {
        boolean checkNum = true;

        String strNumber = String.valueOf(number);

        for (int i = 0; i < strNumber.length(); i++)
        {
            if (strNumber.charAt(i) == '0')
            {
               checkNum = false; 
            }
        }

        return checkNum;
    }


}