class Solution 
{
    public String winningPlayer(int x, int y){

        Boolean aliceTurn = true;
        
        Boolean bobTurn = false;
    

        while (x >= 1 && y >= 4)
        {
            x = x - 1;
            y = y - 4;

            if (bobTurn)
            {
                bobTurn = false;
                aliceTurn = true;
                continue;
            }

            if (aliceTurn)
            {
                aliceTurn = false;
                bobTurn = true;
                continue;
            }
        }

        String result = "";
        
        if (bobTurn)
        {
            result = "Alice";
        }

        if (aliceTurn)
        {
            result = "Bob";
        }

        return result;
        
    }
}