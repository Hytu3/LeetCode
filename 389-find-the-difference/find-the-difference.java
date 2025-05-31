class Solution 
{
    public char findTheDifference(String s, String t) 
    {
        char missingLetter = 0;  // Default initialization

        // Use XOR to detect the additional letter
        for (int i = 0; i < s.length(); i++) 
        {
            missingLetter ^= s.charAt(i);
        }
        
        for (int j = 0; j < t.length(); j++) 
        {
            missingLetter ^= t.charAt(j);        
        }

        return missingLetter;
    }
}
