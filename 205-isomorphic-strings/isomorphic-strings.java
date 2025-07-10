class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> mappedValues = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map.containsKey(c1)) {
                // Check if mapping is consistent
                if (map.get(c1) != c2) return false;
            } else {
                // Make sure no two keys map to the same value
                if (mappedValues.contains(c2)) return false;

                map.put(c1, c2);
                mappedValues.add(c2);
            }
        }

        return true;
    }
}
