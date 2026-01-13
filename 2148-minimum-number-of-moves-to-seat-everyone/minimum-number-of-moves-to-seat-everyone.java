class Solution 
{
    public int minMovesToSeat(int[] seats, int[] students) 
    {
        // Sort the arrays first
        Arrays.sort(seats);
        Arrays.sort(students);

        
        int sum = 0;

        

        for (int i = 0; i < seats.length; i++)
        {
            int num1 = seats[i];

            int num2 = students[i];

            // Add the difference to the sum
            int diff = num1 - num2;

            sum += Math.abs(diff);
        }

        // Sum is the minimum amount of moves to seat everyone
        return sum;
        
    }
}