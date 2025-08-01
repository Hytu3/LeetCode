class Solution {
    public int maximumProduct(int[] nums) {
        // Initialize three largest and two smallest values
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        // Traverse the array once to find the top 3 max and bottom 2 min
        for (int n : nums) {
            // Update max values
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }

            // Update min values
            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
        }

        // Compute both possible products
        int product1 = max1 * max2 * max3;
        int product2 = max1 * min1 * min2;

        // Return the maximum of the two
        return Math.max(product1, product2);
    }
}
