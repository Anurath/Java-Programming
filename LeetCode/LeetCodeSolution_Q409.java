class LeetCodeSolution_Q409{
	//Q.409
    public int longestPalindrome(String s) {
        int oddMax = 0;
		int evenSum=0;
		int[] count = new int[s.length()];
		for(int i=0;i<s.length();i++)
		{
			if(count[i]!=-1)
			{
				int cnt=1;
				for(int j=i+1;j<s.length();j++)
				{
					if(s.charAt(i)==s.charAt(j))
					{
						count[j]=-1;
						cnt++;
					}
				}
				if(cnt%2==1)
				{
					if(cnt>oddMax)
					{
                        if(oddMax>2)
                        {
                            evenSum+=(oddMax-1);
                        }
						oddMax=cnt;
					}
					else if(cnt>2)
					{
					    evenSum+=(cnt-1);
					}
				}
				else
				{
					evenSum+=cnt;
				}
			}
		}
		return oddMax+evenSum;
    }
}