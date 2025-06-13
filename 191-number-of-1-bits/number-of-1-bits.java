class Solution 
{
    public int hammingWeight(int n) 
    {
        //Convert number to binary
        //Convert binary number to string

        String binary = Integer.toBinaryString(n);
        
        //Count occurrences of 1s on the string
        int count = 0;

        for (int i = 0; i < binary.length(); i++)
        {
            if (binary.charAt(i) == '1')
            {
                count++;
            }
        }

        //Return number of set bits
        return count;
        
    }

    
}