class LeetCodeSolution_Q151 {
        public String reverseWords(String s) {
        String ans = "";
        String temp = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                temp = s.charAt(i)+temp;
            }
            else
            {
                if(temp.length()>0)
                {
                    ans+=temp+" ";
                }
                temp="";
            }
        }
		ans+=temp;
        return ans.trim();
    }
}