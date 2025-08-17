class LeetCodeSolution_Q796{
    public boolean rotateString(String s, String goal) {
        for(int i=0;i<s.length();i++)
        {
            String temp = "";
            char ch = s.charAt(0);

            for(int j=1;j<s.length();j++)
            {
                temp+=s.charAt(j);
            }
            temp+=ch;
            if(temp.equals(goal))
            {
                return true;
            }
            else{
                s=temp;
            }
        }
		return false;
    }
}