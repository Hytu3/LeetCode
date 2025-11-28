class Solution 
{
    public int maxScore(String s) 
    {
        StringBuilder left = new StringBuilder();

        StringBuilder right = new StringBuilder(s);

        PriorityQueue <Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < s.length() - 1; i++)
        {
            char c = s.charAt(i);

            // Add to the left
            left.append(c);

            // Delete from right
            right.deleteCharAt(0);

            // Get the  current score
            getScore(left.toString(), right.toString(), maxHeap);


        }

        return maxHeap.peek();
    }

    // Helper function
    public void getScore(String s1, String s2, PriorityQueue <Integer> maxHeap)
    {
        int score = 0;

        // Traverse left
        for (int i = 0; i < s1.length(); i++)
        {
            char c = s1.charAt(i);

            if (c == '0')
            {
                score++;
            }
            else
            {
                continue;
            }
        }

        // Traverse right
        for (int i = 0; i < s2.length(); i++)
        {
            char c = s2.charAt(i);

            if (c == '1')
            {
                score++;
            }
            else
            {
                continue;
            }
        }

        maxHeap.offer(score);
    }
}