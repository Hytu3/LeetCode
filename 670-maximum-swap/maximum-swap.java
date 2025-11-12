class Solution 
{
    public int maximumSwap(int num) 
    {
        // Edge cases 
        if (num < 12)
        {
            return num;
        }
        
        
        PriorityQueue <Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.offer(num);

        String number = Integer.toString(num);

        for (int i = 0; i < number.length(); i++)
        {
            char x = number.charAt(i);
            
            for (int j = i + 1; j < number.length(); j++)
            {
                StringBuilder sb = new StringBuilder(number);
                
                char y = number.charAt(j);

                // If digits are the same no need to swap
                if (x == y)
                {
                    continue;
                }

                // Swaps two digits
                sb.setCharAt(i, y);
                sb.setCharAt(j, x);

                int result = Integer.parseInt(sb.toString());

                maxHeap.offer(result);
            }
        }
        
        int anwser = maxHeap.peek();            

        return anwser;
        
    }
}