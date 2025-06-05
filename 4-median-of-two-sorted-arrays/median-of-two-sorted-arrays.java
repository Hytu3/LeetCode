class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int[] newArray = new int[nums1.length + nums2.length];
        int index = 0;

        // Copy all elements from nums1
        for (int i = 0; i < nums1.length; i++) {
            newArray[index++] = nums1[i];
        }

        // Copy all elements from nums2
        for (int j = 0; j < nums2.length; j++) {
            newArray[index++] = nums2[j];
        }

        // Sort the new array if needed (since brute force is okay)
        Arrays.sort(newArray);

        double median =  0.0;

        
        int midpoint = newArray.length / 2;
        
        if (newArray.length % 2 == 0)
        {
            median = (newArray[midpoint - 1] + newArray[midpoint] ) / 2.0;
        }
        else 
        {
            median = newArray[midpoint];
        }


        return median;
        
        
    }
}