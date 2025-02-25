class MixSolution
{
	public static void main(String[] args)
	{
		checkPrime(13);
		makePrime(20);
		goodPrime(20);
	}
	public static void checkPrime(int num)
	{
		boolean flag = true;
		for (int i=2;i<num ;i++ )
		{
			if(num%i==0)
			{
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("Number is Prime number.");
		else
			System.out.println("Number is not Prime number.");
	}

	//Make Prime Number 
	public static void makePrime(int num)
	{
		for (int i=2;i<num ;i++ )
		{
			if (num%i==0)
			{
				num++;
			}
		}
		System.out.println(num);
	}

	// Good Prime In Range
	public static void goodPrime(int num)
	{
		for (int i=2;i<=num ;i++ )
		{
			boolean flag = true;
			for (int j=2;j<i;j++ )
			{
				if (i%j==0)
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				boolean flag1 = true;
				for (int j=i;j>0 ;j/=10 )
				{
					int rem = j%10;
					for (int k=2;k<rem ;k++ )
					{
						if (rem%k==0)
						{
							flag1 = false;
							break;
						}
					}
					if(flag1)
					 System.out.println(i);
				}
			}
		}
	}
}