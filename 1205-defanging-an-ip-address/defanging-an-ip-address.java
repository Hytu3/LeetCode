class Solution 
{
    public String defangIPaddr(String address) 
    {
        StringBuilder sb = new StringBuilder();

        for (char c : address.toCharArray())
        {
            if (c == '.')
            {
                sb.append("[.]");
                continue;
            }

            sb.append(c);
        }

        return sb.toString();
        
    }
}