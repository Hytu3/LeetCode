class Solution 
{
    public int maxArea(int[] height) 
    {
        int left = 0;                     // start at the leftmost bar
        int right = height.length - 1;    // start at the rightmost bar
        int maxArea = 0;

        while (left < right) 
        {
            // Calculate width and area
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;

            // Update max area
            if (area > maxArea) 
            {
                maxArea = area;
            }

            // Move the pointer that's limiting the height
            if (height[left] < height[right]) 
            {
                left++;
            } else 
            {
                right--;
            }
        }

        return maxArea;
    }
}
