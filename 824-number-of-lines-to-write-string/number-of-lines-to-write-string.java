class Solution 
{
    public int[] numberOfLines(int[] widths, String s) 
    {
        // Put all letters into a hashmap with their corresponding widths
        HashMap<Character,Integer> map = new HashMap<>();
        
        for (int i = 0; i < widths.length; i++)
        {
            char c = (char) ('a' + i);
            map.put(c, widths[i]);
        }

        int lines = 1;       // start with 1 line
        int currentWidth = 0; // width of current line

        // Traverse each character in the string
        for (int j = 0; j < s.length(); j++)
        {
            char x = s.charAt(j);

            int width = map.get(x);

            // If adding this char exceeds 100, move to new line
            if (currentWidth + width > 100) 
            {
                lines++;
                currentWidth = 0;
            }

            currentWidth += width;
        }

        // Return total lines and last line width
        int[] result = {lines, currentWidth};
        return result;
    }
}
