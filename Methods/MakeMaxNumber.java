class  MakeMaxNumber
{
	//Leet Code Problem 
	public static void main(String[] args) 
	{
		System.out.println(maxNum(1));
	}
	public static int maxNum(int num)
	{
		int maxNum =0 ,minNum=9,cnt=0;
        String str="";
        for(int i=num;i!=0;i/=10)
        {
            int rem = i%10;
            if(rem>maxNum)
            {
                maxNum=rem;
            }
            else if (rem<minNum)
            {
                minNum=rem;
            }
			cnt++;
        }
		if(cnt==1)
		{
			return num;
		}
        for(int i=num;i!=0;i/=10)
        {
            if(i%10==minNum)
            {
                str=maxNum+str;
            }
            else if(i%10==maxNum)
            {
                str=minNum+str;
            }
			else
			{
				str=(i%10)+str;
			}
        }
		int op=Integer.parseInt(str);
		return op;
	}
}

