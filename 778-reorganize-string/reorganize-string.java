class Solution {
    public String reorganizeString(String s) {
        if (s == null || s.length() <= 1) return s;

        // Assuming lowercase English letters. If other chars are allowed,
        // use a HashMap<Character, Integer> instead.
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;

        // Quick impossibility check: if any char appears more than (n+1)/2, impossible
        int n = s.length();
        for (int f : freq) {
            if (f > (n + 1) / 2) return "";
        }

        // Max-heap: store entries as int[2] {count, charIndex}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) pq.add(new int[] { freq[i], i });
        }

        StringBuilder sb = new StringBuilder();

        // Always take the two most frequent letters and append them
        while (pq.size() > 1) {
            int[] a = pq.poll();
            int[] b = pq.poll();

            sb.append((char) (a[1] + 'a'));
            sb.append((char) (b[1] + 'a'));

            if (--a[0] > 0) pq.add(a);
            if (--b[0] > 0) pq.add(b);
        }

        // One left? append it (its count must be 1 due to the earlier impossibility check)
        if (!pq.isEmpty()) {
            sb.append((char) (pq.peek()[1] + 'a'));
        }

        return sb.toString();
    }

}
