class Solution 
{
    public List<List<Integer>> minimumAbsDifference(int[] arr) 
    {
        List<List<Integer>> outerList = new ArrayList<>();

        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++)
        {
            int j = i - 1;

            int diff = arr[i] - arr[j];

            if (diff <= min)
            {
                min = diff;
            }
        }

        for (int i = 1; i < arr.length; i++)
        {
            int j = i - 1;

            int diff = arr[i] - arr[j];

            if (diff <= min)
            {
                min = diff;
            }
        }

        for (int i = 1; i < arr.length; i++)
        {
            int j = i - 1;

            List<Integer> list = new ArrayList<>();

            list.add(arr[j]);
            list.add(arr[i]);

            int diff = arr[i] - arr[j];

            if (diff == min)
            {
                outerList.add(list);
            }
        }

        return outerList;
        
    }
}