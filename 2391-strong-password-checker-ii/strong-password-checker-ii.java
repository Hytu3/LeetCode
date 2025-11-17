class Solution 
{
    public boolean strongPasswordCheckerII(String password) 
    {
        // Length checker
        
        if (password.length() < 8)
        {
            
            return false;
        }

        Boolean hasLowerCase = false;

        Boolean hasUpperCase = false;

        Boolean hasDigit = false;

        Boolean hasSpecialChar = false;

        
        
        for (int i = 0; i < password.length(); i++)
        {
            char c = password.charAt(i);

            // Next character check
            if (i < password.length() - 1)
            {
                int j = i + 1;

                char d = password.charAt(j);

                if (c == d)
                {
                    return false;
                }

            }

            if (Character.isDigit(c))
            {
                hasDigit = true;
                continue;
            }

            if (!Character.isLetterOrDigit(c))
            {
                hasSpecialChar = true;
                continue;
            }

            if (Character.isUpperCase(c))
            {
                hasUpperCase = true;
                continue;
            }

            if (Character.isLowerCase(c))
            {
                hasLowerCase = true;
                continue;
            }
        }

        // Password needs to pass all criteria
        if (hasDigit && hasLowerCase && hasUpperCase && hasSpecialChar)
        {
            return true;
        }

        return false;


        
    }
}