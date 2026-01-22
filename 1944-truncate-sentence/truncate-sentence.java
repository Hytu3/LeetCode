class Solution 
{
    public String truncateSentence(String s, int k) 
    {
        // Split into word array
        String[] arr = s.split(" ");

        StringBuilder sb = new StringBuilder();

        // Build sentence out with k amount of words
        for (String x : arr)
        {
            
            if (k == 1)
            {
                sb.append(x);
                break;
            }
            
            
            sb.append(x);
            sb.append(" ");

            k--;
            
        }

        return sb.toString();
        
    }
}