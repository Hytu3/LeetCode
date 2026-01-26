class Solution 
{
    public int minimumSum(int num) 
    {
        // Build out the two mininum four digit numbers
        StringBuilder sb1 = new StringBuilder();

        StringBuilder sb2 = new StringBuilder();

        // Use priority queue to track min values
        PriorityQueue <Integer> minHeap = new PriorityQueue<>();

        String s = Integer.toString(num);

        for (char c : s.toCharArray())
        {
            int digit = c - '0';

            minHeap.offer(digit);
        }

        // Use boolean on switch to add digits to numbers the right way
        Boolean on = true;
        
        while (!minHeap.isEmpty())
        {
            if (on)
            {
                on = false;
                char ch = (char) (minHeap.poll() + '0');
                sb1.append(ch);
                continue;
            }

            on = true;
            char ch = (char) (minHeap.poll() + '0');
            sb2.append(ch);
            continue;

                       
        }

        int new1 = Integer.parseInt(sb1.toString());
        int new2 = Integer.parseInt(sb2.toString());

        return new1 + new2;
        
    }
}