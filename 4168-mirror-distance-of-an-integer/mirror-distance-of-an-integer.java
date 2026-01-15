class Solution 
{
    public int mirrorDistance(int n) 
    {

        // Convert to string than reverse
        String m = Integer.toString(n);

        StringBuilder sb = new StringBuilder(m);

        sb.reverse();

        // Convert back to int
        int mirror = Integer.parseInt(sb.toString());

        // Get the mirror distance
        int distance = n - mirror;

        int mirrorDistance = Math.abs(distance);

        return mirrorDistance;
        
    }
}