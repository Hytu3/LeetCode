class Solution 
{
  public int missingNumber(int[] nums) {
    // Step 1: Find the maximum value inside the array to determine the range
    int MaxVal = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] > MaxVal) {
            MaxVal = nums[i];
        }
    }

    // Step 2: Create a new array with MaxVal as the largest value, with descending order from MaxVal to 0
    int[] descendingArray = new int[MaxVal + 1]; // Size is MaxVal + 1 to include 0
    for (int i = 0; i <= MaxVal; i++) {
        descendingArray[i] = MaxVal - i; // Fill from MaxVal down to 0
    }

    // Step 3: Compare both arrays and find the missing value
    for (int i = 0; i < nums.length; i++) {
        for (int j = 0; j < descendingArray.length; j++) {
            if (nums[i] == descendingArray[j]) {
                // Once a match is found, mark that number as "found" in descendingArray by setting it to -1
                descendingArray[j] = -1;
                break; // Move to the next number in nums
            }
        }
    }

    // Step 4: The missing number is the first -1 we encounter in descendingArray
    for (int i = 0; i < descendingArray.length; i++) {
        if (descendingArray[i] != -1) {
            return descendingArray[i]; // Return the missing number
        }
    }

    // If no number is missing (i.e., array is complete), return MaxVal + 1
    return MaxVal + 1;
}
      
    
}