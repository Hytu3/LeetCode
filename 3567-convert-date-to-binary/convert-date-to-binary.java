class Solution 
{
    public String convertDateToBinary(String date) 
    {
        // Split into an array of strings seperated by "-""
        String[] arr = date.split("-");

        // Build new string out
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++)
        {
            String x = arr[i];
            
            // Convert to Integer
            int s = Integer.parseInt(x);

            // Convert to binary string
            String binary = Integer.toBinaryString(s);

            sb.append(binary);

            sb.append('-');
        }

        // Removes last "-"
        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
        
    }
}