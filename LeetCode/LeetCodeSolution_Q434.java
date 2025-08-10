class LeetCodeSolution_Q434{
    public int countSegments(String s) {
       int cnt=0;
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                if(temp.length()>0)
                {
                    cnt++;
                    temp="";
                }
            }
            else{
                temp+=s.charAt(i);
            }
        }
		if(temp.length()>0)
		{
			cnt++;
		}
        return cnt;
    }
}