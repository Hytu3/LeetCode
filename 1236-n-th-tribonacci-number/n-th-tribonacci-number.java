class Solution 
{
    public int tribonacci(int n) 
    {
      int[] array = new int[n+1];

      // Initialize array based on base cases
      if (n == 0)
      {
        array[0] = 0;
      }
      
      if (n == 1)
      {
        array[0] = 0;
        array[1] = 1;
      }
      
      if (n >= 2)
      {
        array[0] = 0;
        array[1] = 1;
        array[2] = 1;
      }
      

      for (int i = 3; i < array.length; i++)
      {
        array[i] = array[i - 3] + array[i - 2] + array [i - 1];
      } 
    
    return array[n];
        
    }
}