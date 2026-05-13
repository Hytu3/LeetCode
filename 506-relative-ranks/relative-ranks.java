class Solution 
{
    public String[] findRelativeRanks(int[] score) 
    {
        // Store each score rank in a hashmap
        Map<Integer,Integer> map = new HashMap<>();

        int[] copy = Arrays.copyOf(score, score.length);

        Arrays.sort(copy);

        int rank = score.length;

        for (int num : copy)
        {
            map.put(num,rank);
            rank--;
        }

        // Return those ranks in a string array
        String[] result = new String[score.length];

        for (int i = 0; i < score.length; i++)
        {
            if (map.get(score[i]) == 1)
            {
                result[i] = "Gold Medal";
                continue;
            }

            if (map.get(score[i]) == 2)
            {
                result[i] = "Silver Medal";
                continue;
            }

            if (map.get(score[i]) == 3)
            {
                result[i] = "Bronze Medal";
                continue;
            }

            String s = Integer.toString(map.get(score[i]));

            result[i] = s;
        }

        return result;
        
    }
}