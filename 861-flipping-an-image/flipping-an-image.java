class Solution 
{
    public int[][] flipAndInvertImage(int[][] image) 
    {
        int[][] newMatrix = new int[image.length][image[0].length];

        // Reverse each row and store into new matrix
        for (int i = 0; i < image.length; i++)
        {
            for (int j = 0; j < image[i].length; j++)
            {
                // Store reverse into new matrix
                newMatrix[i][image[i].length - 1 - j] = image[i][j];
            }
        }

        // Traverse new matrix and swap 0's and 1's
        for (int i = 0; i < newMatrix.length; i++)
        {
            // Traverse rows backwards
            for (int j = 0; j < newMatrix[i].length; j++)
            {
                // Swap 0s and 1s
                if (newMatrix[i][j] == 1)
                {
                    newMatrix[i][j] = 0;
                    continue;         
                }

                if (newMatrix[i][j] == 0)
                {
                    newMatrix[i][j] = 1;
                    continue;         
                }
            }
        }

        return newMatrix;
        
    }
}