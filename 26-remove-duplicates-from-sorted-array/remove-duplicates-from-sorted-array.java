class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; // Handle empty array
        }
        
        int k = 1; // Pointer for placing unique elements (start at 1, as the first element is always unique)
        
        for (int i = 1; i < nums.length; i++) { // Start from the second element
            if (nums[i] != nums[i - 1]) { // Compare current element with the previous one
                nums[k] = nums[i]; // Place the unique element at index k
                k++; // Increment the unique element counter
            }
        }
        
        return k; // Number of unique elements
    }
}
