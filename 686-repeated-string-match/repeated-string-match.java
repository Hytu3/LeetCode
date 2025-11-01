class Solution 
{
    public int repeatedStringMatch(String a, String b) 
    {
        // If a contains b already
        if (a.contains(b))
        {
            return 1;
        }
        
        
        // Strings are equal so return 1
        if (b.equals(a))
        {
            return 1;
        }

        int count = 1;

        StringBuilder sb = new StringBuilder(a);

        while (sb.length() < b.length())
        {
            count++;
            
            sb.append(a);

        }

        
        // Store modified a into s
        String s = sb.toString();

        // Check if it is a substring
        if (s.contains(b))
        {
            return count;
        }
        else
        {
            // Increment one more time to make sure
            sb.append(a);
            if (sb.toString().contains(b))
            {
                return count + 1;
            }
        }

        // If condition isnt met it isnt possible
        return -1;

        
    }
}