class Solution 
{
    public boolean checkIfExist(int[] arr) 
    {
        Set <Integer> set = new HashSet<>();

        int zeroCount = 0;

        // Add numbers into set
        for (int num : arr)
        {
            set.add(num);

            if (num == 0)
            {
                zeroCount++;
            }
        }


        for (int i = 0; i < arr.length; i++)
        {
            int target = (arr[i] * 2);

            if (set.contains(target) && zeroCount > 1)
            {
                return true;
            }

            if (set.contains(target) && zeroCount == 0)
            {
                return true;
            }

            if (set.contains(target) && zeroCount == 1 && target != 0)
            {
                return true;
            }
        }

        // If no double value found return false
        return false;
        
    }
}