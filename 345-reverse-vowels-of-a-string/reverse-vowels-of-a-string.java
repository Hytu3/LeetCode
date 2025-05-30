class Solution {
    public String reverseVowels(String s) {
        // Convert the string to a character array
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Move left pointer until it finds a vowel
            while (left < right && !"aeiouAEIOU".contains(chars[left] + "")) {
                left++;
            }

            // Move right pointer until it finds a vowel
            while (left < right && !"aeiouAEIOU".contains(chars[right] + "")) {
                right--;
            }

            // Swap the vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move both pointers inward
            left++;
            right--;
        }

        // Convert the modified char array back to a string
        return new String(chars);
    }
}
