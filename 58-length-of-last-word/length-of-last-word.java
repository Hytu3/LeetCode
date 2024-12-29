class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;

        // Iterate backward through the string
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') { 
                count++;  // Count non-space characters
            } else if (count > 0) { 
                // Break if a space is encountered after counting the last word
                break;
            }
        }

        return count; // Return the length of the last word
    }
}
