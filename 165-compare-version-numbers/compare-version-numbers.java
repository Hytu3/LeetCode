class Solution 
{
    public int compareVersion(String version1, String version2) 
    {
        List<Integer> list1 = new ArrayList<>();

        StringBuilder sb1 = new StringBuilder();

        for (int i = 0; i < version1.length(); i++)
        {
            char c = version1.charAt(i);

            sb1.append(c);

            if(c == '.')
            {
                // Delete the '.' so that only numbers remain
                sb1.deleteCharAt(sb1.length() - 1);

                // Build number by building string then converting to int and adding to a list
                String num1 = sb1.toString();
                int number1 = Integer.parseInt(num1);
                list1.add(number1);

                // Clear stringbuilder to build new number
                sb1.setLength(0);
            }
        }

        // Handle leftover number after loop (last segment)
        if (sb1.length() > 0)
        {
            int number1 = Integer.parseInt(sb1.toString());
            list1.add(number1);
        }

        List<Integer> list2 = new ArrayList<>();

        StringBuilder sb2 = new StringBuilder();

        for (int k = 0; k < version2.length(); k++)
        {
            char d = version2.charAt(k);

            sb2.append(d);

            if(d == '.')
            {
                // Delete the '.' so that only numbers remain
                sb2.deleteCharAt(sb2.length() - 1);

                // Build number by building string then converting to int and adding to a list
                String num2 = sb2.toString();
                int number2 = Integer.parseInt(num2);
                list2.add(number2);

                // Clear stringbuilder to build new number
                sb2.setLength(0);
            }
        }

        // Handle leftover number after loop (last segment)
        if (sb2.length() > 0)
        {
            int number2 = Integer.parseInt(sb2.toString());
            list2.add(number2);
        }

        // Check to ensure both lists are the same size, if not add zeros
        while (list1.size() > list2.size())
        {
            list2.add(0);
        }

        while (list2.size() > list1.size())
        {
            list1.add(0);
        }

        // Compare the parts of both lists in order
        for (int i = 0; i < list1.size(); i++)
        {
            int val1 = list1.get(i);
            int val2 = list2.get(i);

            // Return the appropriate number based on condition
            if (val1 > val2)
            {
                return 1;
            }

            if (val1 < val2)
            {
                return -1;
            }
        }

        return 0;

    }
}

