class Solution 
{
    public int mostWordsFound(String[] sentences) 
    {
        int max = 0;

        // Split each string into an array of words
        for (String s : sentences)
        {
            // Compare each array size
            String[] arr = s.split(" ");

            int size = arr.length;

            if (size >= max)
            {
                max = size;
            }
        }
        
        return max;
    }
}