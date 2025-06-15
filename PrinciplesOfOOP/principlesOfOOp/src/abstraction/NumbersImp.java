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
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num/=10;
		}
		
		return  rev;
	}
	
	public boolean petersonNumber(int num)
	{
		int res = 0;
		int dep = num;
		
		while(num!=0)
		{
			res+=factor(num%10);
			num/=10;
		}
		return res ==dep;
	}
	
	public int factor(int num)
	{
		int fact = 1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		return fact;
	}
	
	public boolean sunnyNumber(int num)
	{
		num+=1;
		boolean flag = false;
		for(int i=1;i<num;i++)
		{
			if(i*i==num)
			{
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean techNumber(int num)
	{
		int fh = num/100;
		int lh = num%100;
		
		int sum  = fh + lh;
		return sum*sum==num;
	}
	
	public boolean neonNumber(int num)
	{
		int sum = 0;
		int sqr  = num*num;
		while(sqr!=0)
		{
			sum+=sqr%10;
			sqr/=10;
		}
		return num == sum;
	}
	
	public boolean spyNumber(int num)
	{
		int mult = 1;
		int sum = 0;
		
		while(num!=0)
		{
			mult*=num%10;
			sum+=num%10;
			num/=10;
		}
		return mult == sum;
	}
	
	public boolean emirp(int num)
	{
		if(isPrime(num))
		{
			if(isPrime(reverseNumber(num)))
			{
				return true;
			}
		}
		return false;
	}
}
