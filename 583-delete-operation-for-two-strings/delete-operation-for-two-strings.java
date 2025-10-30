class Solution 
{
    public int minDistance(String word1, String word2) 
    {
        int n = word1.length();
        int m = word2.length();

        // dp[i][j] = LCS length of word1[0..i-1] and word2[0..j-1]
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= m; j++)
            {
                if (word1.charAt(i - 1) == word2.charAt(j - 1))
                {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                else
                {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        int lcsSize = dp[n][m];

        // min deletions = (n - lcs) + (m - lcs) = n + m - 2*lcs
        return n + m - 2 * lcsSize;
    }
}
