class Solution 
{
    public List<String> topKFrequent(String[] words, int k) 
    {
        HashMap<String, Integer> map = new HashMap<>();

        List<String> list = new ArrayList<>();

        // Word frequency tracker
        for (String s : words)
        {
            int count = 1;
            
            if (map.containsKey(s))
            {
                count = map.get(s) + 1;
            }

            map.put(s,count);
        }

        PriorityQueue<String> maxHeap = new PriorityQueue<>
        (
            (a, b) -> 
            {
                if (map.get(a).equals(map.get(b))) 
                {
                    return a.compareTo(b); // Lexicographically smaller first
                }
                return map.get(b) - map.get(a); // Larger value first
            }
        );

        // Add strings into heap
        for (String s : map.keySet())
        {
            maxHeap.offer(s);
        }
        
        while (k > 0)
        {
            list.add(maxHeap.poll());
            --k;
        }

        return list;
 

    }
}