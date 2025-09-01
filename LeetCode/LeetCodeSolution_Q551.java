class LeetCodeSolution_Q551 {
    public boolean checkRecord(String s) {
        
        int late = 0;
        int abs = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A')
            {
                abs++;
                late=0;
            }
            else if(s.charAt(i)=='P')
            {
                late = 0;
            }
            else if(s.charAt(i)=='L')
            {
                late++;
            }
            if(late==3)
            {
                return false;
            }
            if(abs>1)
            {
                return false;
            }
        }
        return abs<2;
    }
}