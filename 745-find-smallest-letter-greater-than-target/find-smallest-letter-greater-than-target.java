class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        List<Character> list = new ArrayList<>();
        for (char c : letters) {
            if (!list.contains(c)) {  // keep unique
                list.add(c);
            }
        }

        for (char c : list) {
            if (c > target) {
                return c;
            }
        }

        return list.get(0);
    }
}
