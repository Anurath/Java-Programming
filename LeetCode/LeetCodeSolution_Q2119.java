class LeetCodeSolution_Q2119 
{
	public static void main(String[] args) 
	{
		int newNum=rev(526);
		System.out.println(newNum);
		System.out.println(rev(newNum));
	}
	public static int rev(int num)
    {
        int rev=0;
        for(int i=num;i!=0;i/=10)
        {
            rev=rev*10+(i%10);
        }
        return rev;
    }
}