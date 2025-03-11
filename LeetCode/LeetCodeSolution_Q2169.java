class  LeetCodeSolution_Q2169
{
	public static void main(String[] args) 
	{
		System.out.println(opCount(2,3));
	}
	public static int opCount(int num1,int num2)
	{
		 int cnt=0;
        for(;;)
        {
            if(num1>num2)
            {
                num1-=num2;
                cnt++;
            }
            else if(num1<num2)
            {
                num2-=num1;
                cnt++;
            }
			else if (num1==0||num2==0)
			{
				return cnt;
			}
        }
	}
}
