class Solution 
{
    public List<List<Integer>> minimumAbsDifference(int[] arr) 
    {
       
       List<List<Integer>> outerList = new ArrayList<>();
       
       // Store all differences
       List<Integer> diffList = new ArrayList<>();


       // Sort the array first
       Arrays.sort(arr);

       // Traverse array and find all differences between integers and store them
       // In diff list
       
       for(int i = 1; i < arr.length; i++)
       {
         diffList.add(arr[i] - arr[i - 1]);
       }

       // Find minimum absolute difference
       
       Integer minDiff = Collections.min(diffList);

       // Check indeces again and see if they match minimum difference
       for (int i = 1; i < arr.length; i++)
       {
            List<Integer> innerList = new ArrayList<>();

            if (arr[i] - arr[i-1] == minDiff)
            {
                innerList.add(arr[i-1]);
                innerList.add(arr[i]);
                outerList.add(innerList);
            }
            
        }

        return outerList;
    }
}