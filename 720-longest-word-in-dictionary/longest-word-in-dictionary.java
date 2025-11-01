class Solution {
    public String longestWord(String[] words) {
        // Sort by length ascending first, then lexicographically
        Arrays.sort(words, (a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            }
            return a.compareTo(b);
        });

        HashMap<String, Integer> map = new HashMap<>();
        
        for (String word : words) {
            if (word.length() == 1) {
                map.put(word, 1); // 1 means valid
            } else {
                String prefix = word.substring(0, word.length() - 1);
                if (map.containsKey(prefix) && map.get(prefix) == 1) {
                    map.put(word, 1); // Valid if prefix exists and is valid
                } else {
                    map.put(word, 0); // Invalid
                }
            }
        }

        // Find the longest valid word
        String result = "";
        for (String word : words) {
            if (map.getOrDefault(word, 0) == 1) {
                if (word.length() > result.length() || 
                    (word.length() == result.length() && word.compareTo(result) < 0)) {
                    result = word;
                }
            }
        }

        return result;
    }
}