class Solution 
{
    public int countSegments(String s) 
    {
       int count = 0;

       // Edge cases
       if (s.isEmpty())
       {
         return count;
       }

       // If a string has a non space character check for number of segments
       if (s.matches(".*\\S.*")) 
       {
         
            // Split by space
            String[] words = s.trim().split("\\s+");  // Handles multiple spaces

            
            int wordCount = words.length;

            count = wordCount;

       }
       
       return count;
    }
}