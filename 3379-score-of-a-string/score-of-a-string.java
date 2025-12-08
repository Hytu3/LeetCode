class Solution 
{
    public int scoreOfString(String s) 
    {
        int score = 0;

        for (int i = 1; i < s.length(); i++)
        {
            int j = i - 1;

            char x = s.charAt(j);
            char y = s.charAt(i);

            int diff = x - y;

            int num = Math.abs(diff);

            score += num;
        }

        return score;
        
    }
}