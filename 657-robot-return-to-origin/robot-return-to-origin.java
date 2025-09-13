class Solution 
{
    public boolean judgeCircle(String moves) 
    {
        // Make simple pointers to keep track of position
        
        int verticalPos = 0;
        int horizontalPos = 0;
        
        for(int i = 0; i < moves.length(); i++)
        {
            char c = moves.charAt(i);

            // Edgde case since it needs an even amount of moves to return to origin
            if (moves.length() % 2 != 0)
            {
                return false;
            }

            if (c == 'R')
            {
                horizontalPos++;
            }
            if (c == 'L')
            {
                --horizontalPos;
            }
            if (c == 'U')
            {
                verticalPos++;
            }
            if (c == 'D')
            {
               --verticalPos; 
            }
        }

        // If both positions show zero after string traversal Robot must have returned to origin
        
        if (verticalPos == 0 && horizontalPos == 0)
        {
            return true;
        }

        return false;
        
    }
}