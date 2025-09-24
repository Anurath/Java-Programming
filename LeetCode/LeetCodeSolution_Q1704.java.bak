class LeetCodeSolution_Q1704 {
    public boolean halvesAreAlike(String s) {
        int mid = s.length()/2;
        int cnt=0;
        for(int i=0;i<mid*2;i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
            {
                if(i<mid)
                {
                    cnt++;
                }
                else{
                    cnt--;
                }
            }
        }
        return cnt==0;
    }
}