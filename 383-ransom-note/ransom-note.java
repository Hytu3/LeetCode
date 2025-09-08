class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character in magazine
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Check if ransomNote can be constructed
        for (int j = 0; j < ransomNote.length(); j++) {
            char x = ransomNote.charAt(j);
            if (map.containsKey(x) && map.get(x) > 0) {
                map.put(x, map.get(x) - 1);
            } else {
                return false;  // Not enough chars
            }
        }

        return true;
    }
}
