class Solution {
    
    public int[] sortByBits(int[] arr) {
        
        Map<Integer,Integer> map = new HashMap<>();

        List<Integer> list = new ArrayList<>();

        // Build list and map
        for (int num : arr)
        {
            int bits = countBits(num);
            
            map.put(num,bits);
            list.add(num);
        }

        list.sort((a, b) -> 
        {
        
        if (map.get(a).equals(map.get(b))) {
            
            return a - b;
        }
        
        return map.get(a) - map.get(b);
        });

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++)
        {
            result[i] = list.get(i);
        }

        return result;
        
    }

    public int countBits(int number)
    {
        // Convert to binary string
        String binaryString = Integer.toBinaryString(number);

        int count = 0;

        // Traverse string
        for (int i = 0; i < binaryString.length(); i++)
        {
            char c = binaryString.charAt(i);

            if (c == '1')
            {
                count++;
            }
        }

        return count;
    }
}