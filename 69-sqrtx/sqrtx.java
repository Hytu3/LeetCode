class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0; // Edge case
        
        int low = 1, high = x;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Use division to prevent overflow
            if (mid <= x / mid) {  
                low = mid + 1;  // Move right
            } else {
                high = mid - 1; // Move left
            }
        }
        return high; // high holds the floored square root
    }
}
