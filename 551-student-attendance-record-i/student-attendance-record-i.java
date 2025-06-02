class Solution 
{
    public boolean checkRecord(String s) 
    {
        // Check for 3 straight lates
        if (s.contains("LLL"))
        {
            return false;
        }

        int absentCount = 0;

        // Check for less than 2 absenses
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == 'A')
            {
                absentCount++;
            }
        }

        if (absentCount < 2)
        {
            return true;
        }

        return false;
        
    }
}