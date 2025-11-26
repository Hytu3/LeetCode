class Solution 
{
    public String reverseOnlyLetters(String s) 
    {
        // Store letters into list of reverse order
        List <Character> list = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        // Add characters into the letters in the reverse order
        for (int i = s.length() - 1; i >= 0; i--)
        {
            char c = s.charAt(i);

            if (Character.isLetter(c))
            {
                list.add(c);
            }
        }

        // Use this index because list isnt the same size as original array
        int index = 0;
        
        // Traverse normally and build out new string
        for (int j = 0; j < s.length(); j++)
        {
            char d = s.charAt(j);

            if (Character.isLetter(d))
            {
                sb.append(list.get(index));
                index++;
                continue;
            }

            sb.append(d);
        }

        return sb.toString();


        
    }
}