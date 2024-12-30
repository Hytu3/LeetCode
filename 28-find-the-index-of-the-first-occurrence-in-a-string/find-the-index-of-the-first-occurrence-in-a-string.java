class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0; // An empty needle is always found at index 0
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break; // Substring needle stops matching characters with haystack
                }
                if (j == needle.length() - 1) {
                    return i; // If we reach the end of needle, all characters matched
                }
            }
        }

        return -1; // Needle not found
    }
}
