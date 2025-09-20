class Solution 
{
    public boolean rotateString(String s, String goal) 
    {
        int count = s.length();
        
        StringBuilder sb = new StringBuilder(s);

        // String will rotate enough until it goes back to its original state
        
        while (count > 0)
        {
            // Rotate string
            
            char firstChar = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(firstChar);
            String resultString = sb.toString();

            // Compare to see if they match
            
            if (resultString.equals(goal))
            {
                return true;
            }

            --count;


        }


        return false;

        
    }
}