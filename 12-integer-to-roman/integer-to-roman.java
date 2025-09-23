class Solution 
{
    public String intToRoman(int num) 
    {

        // Store each digit into arraylist

        List<Integer> list = new ArrayList<>();

        int exponent = 0;
        
        while (num > 0)
        {
            int digit = num % 10;
            
            int pow = (int) Math.pow(10,exponent);

            int sum = digit * pow;

            list.add(sum);

            exponent++;

            num = num / 10;
            
        }

        // Reverse list to get biggest values first and properly build the string 
        // Traverse arraylist and convert each component into roman numerals and add together as a string

        Collections.reverse(list);
        
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < list.size(); i++)
        {
            int number = list.get(i);
            
            if (number >= 1000) 
            {
                while (number >= 1000) 
                {
                    sb.append("M");
                    number -= 1000;
                }
            }

            if (number >= 900) 
            {
                sb.append("CM");
                number -= 900;
            }

            if (number >= 500) 
            {
                sb.append("D");
                number -= 500;
                while (number >= 100) 
                {
                    sb.append("C");
                    number -= 100;
                }
            }

            if (number >= 400) 
            {
                sb.append("CD");
                number -= 400;
            }

            if (number >= 100) 
            {
                while (number >= 100) 
                {
                    sb.append("C");
                    number -= 100;
                }
            }

            if (number >= 90) 
            {
                sb.append("XC");
                number -= 90;
            }

            if (number >= 50) 
            {
                sb.append("L");
                number -= 50;
                while (number >= 10) 
                {
                    sb.append("X");
                    number -= 10;
                }
            }

            if (number >= 40) 
            {
                sb.append("XL");
                number -= 40;
            }

            if (number >= 10) 
            {
                while (number >= 10) 
                {
                    sb.append("X");
                    number -= 10;
                }
            }

            if (number == 9) 
            {
                sb.append("IX");
                number -= 9;
            }

            if (number >= 5) 
            {
                sb.append("V");
                number -= 5;
                while (number >= 1) 
                {
                    sb.append("I");
                    number -= 1;
                }
            }

            if (number == 4) 
            {
                sb.append("IV");
                number -= 4;
            }

            if (number >= 1) 
            {
                while (number >= 1) 
                {
                    sb.append("I");
                    number -= 1;
                }
            }

        }

        String romanNumeral = sb.toString();

        return romanNumeral;




        
    }
}