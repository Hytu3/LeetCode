class Solution 
{
    public int[] countBits(int n) 
    {
        int[] array = new int[n + 1];

        for (int i = 0; i < array.length; i++)
        {
            String binaryNum = toBinary(i);
            int count = countBinaryOnes(binaryNum);

            array[i] = count;
        }

        return array;
    }

    public String toBinary(int num) 
    {
        StringBuilder binary = new StringBuilder();

        while (num > 0) 
        {
            int remainder = num % 2;
            binary.append(remainder);
            num = num / 2;
        }

        return binary.reverse().toString();
    }

    public int countBinaryOnes(String binary)
    {
        int count = 0;

        for (int i = 0; i < binary.length(); i++)
        {
            if (binary.charAt(i) == '1')
            {
                count++;
            }
        }

        return count;
    }
}
