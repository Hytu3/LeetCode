class Solution {
    public boolean buddyStrings(String s, String goal) {
        // If lengths are different, impossible
        if (s.length() != goal.length()) {
            return false;
        }

        // If strings are already equal, we must have at least one duplicate character
        if (s.equals(goal)) {
            Set<Character> seen = new HashSet<>();
            for (char c : s.toCharArray()) {
                if (seen.contains(c)) {
                    return true; // can swap two duplicates and remain equal
                }
                seen.add(c);
            }
            return false;
        }

        // Otherwise, find all mismatched positions
        List<Integer> diff = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                diff.add(i);
            }
        }

        // There must be exactly 2 differences
        if (diff.size() != 2) {
            return false;
        }

        // Swap those two indices and see if they match
        int i = diff.get(0);
        int j = diff.get(1);

        return (s.charAt(i) == goal.charAt(j) && s.charAt(j) == goal.charAt(i));
    }
}

