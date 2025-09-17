class LeetCodeSolution_Q20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='('||ch=='['||ch=='{')
            {
                stack.push(ch);
            }
            else{
                if(stack.size()==0)
                {
                    return false;
                }
                char ch1 = stack.peek();

                if(ch==')'&&ch1=='('||ch==']'&&ch1=='['||ch=='}'&&ch1=='{')
                {
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.size()==0;
    }
}