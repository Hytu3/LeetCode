import java.util.HashSet;

public class Solution {
    public int missingNumber(int[] nums) {
        // Step 1: Find the maximum value in nums
        int MaxVal = 0;
        for (int num : nums) {
            if (num > MaxVal) {
                MaxVal = num;
            }
        }

        // Step 2: Store nums in a HashSet for quick lookup
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        // Step 3: Find the missing number
        for (int i = 0; i <= MaxVal; i++) {
            if (!numSet.contains(i)) { // If a number is missing, return it
                return i;
            }
        }

        // Step 4: If no number is missing, return the next possible number
        return MaxVal + 1;
    }
}
