class Solution {
    public boolean isPowerOfThree(int n) 
    {
        for (int i = 0; i < 20; i++) 
        {
            int ans = (int) Math.pow(3, i);
            if (ans == n) 
            {
                return true;
            }
        }
        return false;
        
    }
}