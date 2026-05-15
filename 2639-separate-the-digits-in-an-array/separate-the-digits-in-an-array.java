class Solution 
{
    public int[] separateDigits(int[] nums) 
    {
        List<Character> list = new ArrayList<>();

        for (int num : nums)
        {
            String s = Integer.toString(num);

            for (char c : s.toCharArray())
            {
                list.add(c);
            }
        }

        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++)
        {
            char c = list.get(i);
            
            int digit = c - '0';

            arr[i] = digit;
        }

        return arr;
        
    }
}