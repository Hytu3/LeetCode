class Solution {
    public static int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for placing non-val elements

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Place the non-val element at index k
                k++; // Increment k
            }
        }

        return k; // Number of elements not equal to val
    }
}
