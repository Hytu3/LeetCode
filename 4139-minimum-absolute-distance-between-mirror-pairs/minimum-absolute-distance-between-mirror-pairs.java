class Solution {
    public int minMirrorPairDistance(int[] nums) {
        // Map stores: Key = Number we are looking for, Value = Latest index that wants it
        HashMap<Integer, Integer> map = new HashMap<>();
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];

            // 1. Check if a previous number was "waiting" for this current number
            if (map.containsKey(currentNum)) {
                int prevIndex = map.get(currentNum);
                minDistance = Math.min(minDistance, i - prevIndex);
            }

            // 2. Add the REVERSED current number to the map
            // This tells future indices: "If you match this, I'm your mirror"
            // We always update to the LATEST index to keep the distance minimal
            map.put(reverse(currentNum), i);
        }

        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }

    private int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }
}