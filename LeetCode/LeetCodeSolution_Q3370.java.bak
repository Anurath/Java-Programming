class LeetCodeSolution_Q3370{
    public int smallestNumber(int n) {

		while (n>0)
		{
			boolean flag = true;
			for (int i=n;i!=0;i/=2)
				if(i%2==0)
                    flag = false;
			if(flag)
				return n;
			n++;
		}
		return 0;
    }
}