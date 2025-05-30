class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Step 1: Create a temporary array with max possible size
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;

        for (int i = 0; i < nums1.length; i++) {
            // Check if nums1[i] exists in nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    // Check if we've already added this number to temp
                    boolean alreadyExists = false;
                    for (int k = 0; k < index; k++) {
                        if (temp[k] == nums1[i]) {
                            alreadyExists = true;
                            break;
                        }
                    }

                    // If it's not already in the temp array, add it
                    if (!alreadyExists) {
                        temp[index] = nums1[i];
                        index++;
                    }

                    // No need to keep checking nums2 once we found a match
                    break;
                }
            }
        }

        // Step 2: Copy the intersection values into a result array of exact size
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}
