class Solution 
{
    public void reverseString(char[] s) 

    {
        // Make two pointers
        int left = 0;
        int right = s.length - 1;

        while (left < right) 
        {
            // Swap characters at left and right
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move both pointers inward
            left++;
            right--;
        }
    }
}

