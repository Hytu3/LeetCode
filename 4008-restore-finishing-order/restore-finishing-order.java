class Solution 
{
    public int[] recoverOrder(int[] order, int[] friends) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < order.length; i++)
        {
            map.put(order[i], i);
        }

        // Convert int[] to Integer[]
        Integer[] boxed = new Integer[friends.length];
        for (int i = 0; i < friends.length; i++)
        {
            boxed[i] = friends[i];
        }

        // Custom sort
        Arrays.sort(boxed, (a, b) -> map.get(a) - map.get(b));

        // Convert back to int[]
        for (int i = 0; i < friends.length; i++)
        {
            friends[i] = boxed[i];
        }

        return friends;
    }
}
