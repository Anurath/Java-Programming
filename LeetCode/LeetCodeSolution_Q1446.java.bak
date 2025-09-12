class LeetCodeSolution_Q1446 {
    public int maxPower(String s) {
        int max = 0;
        int cnt =1;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                cnt++;
            }
            else{
                if(max<cnt)
                {
                    max=cnt;
                }
                cnt =1;
            }
        }
        if(max<cnt)
        {
            max=cnt;
        }

        return s.length()>1?max:1;
    }
}