class LeetCodeSolution_Q1796 {
    public int secondHighest(String s) {
        int max = -1;
        boolean flag = false;
        int secMax = max,cnt =0;
        for(int i=0;i<s.length();i++)
        {
            int digit = s.charAt(i)-48;
            if(digit<=9&&digit>=0)
			{
				if(digit>max)
				{
					secMax = max;
					cnt++;
					max = digit;
				}
				else if(digit>secMax && digit!=max)
				{
					flag = true;
					secMax = digit;
				}
			}
        }
        if(flag||cnt>1)
        {
            return secMax;
        }
        return -1;
    }
}