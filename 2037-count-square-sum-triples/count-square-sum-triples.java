class Solution 
{
    public int countTriples(int n) 
    {
        Set <Integer> squares = new HashSet<>();
        List <Integer> slist = new ArrayList<>();

        for (int i = 1; i <= n; i++)
        {
            int val = i * i;

            squares.add(val);
            slist.add(val);
        }

        Set <List<Integer>> finalset = new HashSet<>();
        
        for (int i = slist.size() - 1; i >= 0; i--)
        {
            for (int j = 0; j < slist.size(); j++)
            {
                List <Integer> list = new ArrayList<>();
                
                int diff = slist.get(i) - slist.get(j);

                if (squares.contains(diff))
                {
                    list.add(slist.get(j));
                    list.add(diff);
                    list.add(slist.get(i));

                    finalset.add(list);       
                }
            }
        }

        int count = 0;

        if (finalset.size() > 0)
        {
            count = finalset.size();
        }

        return count;




        
    }
}