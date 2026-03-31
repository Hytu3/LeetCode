class Solution 
{
    public boolean isValid(String s) 
    {
        Stack<Character> stack = new Stack<>();

        // Must be even
        if (s.length() % 2 != 0)
        {
            return false;
        }

        for (char c : s.toCharArray())
        {
            if (stack.isEmpty())
            {
                if (c == '{' || c == '(' || c == '[')
                {
                    stack.push(c);
                    continue;   
                }
                
                return false;
            }
            else
            {
                if (stack.peek() == '(')
                {
                    if (c == '(')
                    {
                        stack.push(c);
                        continue;
                    }
                    if (c == ')')
                    {
                        stack.pop();
                        continue;
                    }
                    if (c == '{')
                    {
                        stack.push(c);
                        continue;
                    }
                    if (c == '[')
                    {
                        stack.push(c);
                        continue;
                    }

                    return false;
                }
                if (stack.peek() == '{')
                {
                    if (c == '{')
                    {
                        stack.push(c);
                        continue;
                    }
                    if (c == '}')
                    {
                        stack.pop();
                        continue;
                    }
                    if (c == '(')
                    {
                        stack.push(c);
                        continue;
                    }
                    if (c == '[')
                    {
                        stack.push(c);
                        continue;
                    }

                    return false;
                }
                if (stack.peek() == '[')
                {
                    if (c == '[')
                    {
                        stack.push(c);
                        continue;
                    }
                    if (c == ']')
                    {
                        stack.pop();
                        continue;
                    }
                    if (c == '(')
                    {
                        stack.push(c);
                        continue;
                    }
                    if (c == '{')
                    {
                        stack.push(c);
                        continue;
                    }

                    return false;
                }

                // Stack.peek should never return something else other than openers
                return false;
            }
        }

        // Stack needs to be empty to be true
        if (!stack.isEmpty())
        {
            return false;
        }

        return true;
    }
}