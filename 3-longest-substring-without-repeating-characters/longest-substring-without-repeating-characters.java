class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {

        // Edge case
        if (s.length() == 1)
        {
          return 1;
        }
        
        // Store all substrings without repeating characters
        List<String> list = new ArrayList<>();

        // Use charList instead pf hashmap to check for repeating substrings
        List<Character> charList = new ArrayList<>();

        // Use stringbuilder to build all substrings without repeating characters
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);

            sb.append(c);
            charList.add(c);
            
            boolean broken = false;                 // track whether inner loop broke
            for (int j = i + 1; j < s.length(); j++)
            {
                char d = s.charAt(j);
                
                // Repeating substring checker
                if (charList.contains(d) || d == c)
                {
                    // Break the stringbuilder and add string to list
                    String str = sb.toString();
                    list.add(str);

                    // Clear Char List and StringBuilder to avoid errors
                    charList.clear();
                    sb.setLength(0);

                    broken = true;  // remember that we broke out
                    break;          // move to next i
                }

                sb.append(d);
                charList.add(d);  
            }
            
            // If inner loop did not break, we reached the end without duplicates
            // add the built substring for this starting i and clear for next i
            if (!broken)
            {
                if (sb.length() > 0)
                {
                    list.add(sb.toString());
                    sb.setLength(0);
                    charList.clear();
                }
            }
        }
        
        // Handle remainder in the stringbuilder (should be handled above,
        // but keep as a safe fallback)
        if (sb.length() > 0) 
        {
          list.add(sb.toString());
        }
        
        
        // Edge case of empty list
        if (list.isEmpty()) 
        {
          return 0; 
        }
        
        
        String biggest = Collections.max(list, Comparator.comparingInt(String::length));

        return biggest.length();
    }
}
