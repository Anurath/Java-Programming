class LeetCodeSolution_Q2729{
    public boolean isFascinating(int n) {
       String s=""+n;
		for (byte i=2;i<=3;i++)
		{
			s+=(n*i);
		}
        for(char i='1';i<='9';i++)
        {
            byte cnt=0;
            for(byte j=0;j<s.length();j++)
            {
                if(i==s.charAt(j))
                {
                    cnt++;
                }
            }
            if(cnt!=1)
            {
                return false;
            }
        }
        return true;
    }
}