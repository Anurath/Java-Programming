package abstraction;

public class NumbersImp extends Numbers {
	public int nextPrime(int num)
	{
		int i=num;
		for(;;i++)
		{
			boolean flag = true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				break;
			}
		}
		return i;
	} 
	
	public boolean isPrime(int num)
	{
		boolean flag = true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag = false;
			}
		}
		return flag;
	}
	
	
	public int reverseNumber(int num)
	{
		int rev = 0;
		int dep = num;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num/=10;
		}
		
		return dep = rev;
	}
	
	public
	
	
}
