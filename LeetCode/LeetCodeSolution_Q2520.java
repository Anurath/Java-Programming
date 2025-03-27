class LeetCodeSolution_Q2520{
    public int countDigits(int num) {
        int cnt=0;
		for (int i=num;i!=0;i/=10)
		{
			if(num%(i%10)==0)
				cnt++;
		}
		return cnt;
    }
}