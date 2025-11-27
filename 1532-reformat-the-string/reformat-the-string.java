class Solution 
{
    public String reformat(String s) 
    {
        // Check for possibility
        int digitCount = 0;

        int charCount = 0;

        // Add each character and digit to a list
        List <Character> digit = new ArrayList<>();

        List <Character> letter = new ArrayList<>();

        for (char c : s.toCharArray())
        {
            if (Character.isDigit(c))
            {
                digitCount++;
                digit.add(c);
            }

            if (Character.isLetter(c))
            {
                charCount++;
                letter.add(c);
            }
        }

        int diff = charCount - digitCount;

        int val = Math.abs(diff);

        // It is impossible
        if (val > 1)
        {
            return "";
        }

        // Boolean flags to determine stringbuilding order
        Boolean endsWithDigit = false;
        Boolean endsWithLetter = false;

        if (charCount > digitCount)
        {
            endsWithLetter = true;
        }

        if (digitCount > charCount)
        {
            endsWithDigit = true;
        }

        // If possible use a stringBuilder and build a new string
        StringBuilder sb = new StringBuilder();

        // Reverse both list to make sure new string is different
        Collections.reverse(digit);
        Collections.reverse(letter);

        // Traverse larger list if applicable
        int size = Math.max(digit.size(), letter.size());

        for (int i = 0; i < size; i++)
        {
            // Avoid out of bounds error
            if (i > digit.size() - 1)
            {
                sb.append(letter.get(i));
                continue;
            }

            // Avoid out of bounds error
            if (i > letter.size() - 1)
            {
                sb.append(digit.get(i));
                continue;
            }

            // Add digit first
            if (endsWithDigit)
            {
                sb.append(digit.get(i));
                sb.append(letter.get(i));
                continue;
            }

            // Add letter first
            if (endsWithLetter)
            {
                sb.append(letter.get(i));
                sb.append(digit.get(i));
                continue;
            }

            // Order does not matter here
            if (!endsWithLetter && !endsWithDigit)
            {
                sb.append(letter.get(i));
                sb.append(digit.get(i));  
                continue;       
            }
        }


        return sb.toString();
        
    }
}