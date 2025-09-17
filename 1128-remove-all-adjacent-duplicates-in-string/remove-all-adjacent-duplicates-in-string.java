class Solution {
    public String removeDuplicates(String s) {
        if (s == null || s.length() <= 1) return s;

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            int len = sb.length();
            // If last character in sb matches current, remove it
            if (len > 0 && sb.charAt(len - 1) == c) {
                sb.deleteCharAt(len - 1);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}


