class Solution 
{
    public String convert(String s, int numRows) 
    {
        // Edge case where zigzag pattern doesn't change
        if (numRows == 1 || s.length() <= numRows)
        {
            return s;
        }

        // Initialize StringBuilder for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++)
        {
            rows[i] = new StringBuilder();
        }

        // Pattern repeats every cycle characters
        int cycle = 2 * numRows - 2;

        // Traverse through string and build rows by index
        for (int i = 0; i < s.length(); i++)
        {
            int posInCycle = i % cycle;

            // For the downward direction
            int rowIndex = posInCycle < numRows ? posInCycle : cycle - posInCycle;

            rows[rowIndex].append(s.charAt(i));
        }

        // Combine all rows together
        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : rows)
        {
            result.append(sb);
        }

        return result.toString();
    }
}

