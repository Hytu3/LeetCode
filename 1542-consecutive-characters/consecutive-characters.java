class Solution 
{
    public int maxPower(String s) 
    {
        PriorityQueue <Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < s.length(); i++)
        {
            StringBuilder sb = new StringBuilder();
            
            char x = s.charAt(i);

            sb.append(x);

            for (int j = i + 1; j < s.length(); j++)
            {
                char y = s.charAt(j);

                if (x == y)
                {
                    sb.append(y);
                }
                else
                {
                    break;
                }
            }
            
            
            maxHeap.offer(sb.length());

        }

        return maxHeap.peek();
        
    }
}