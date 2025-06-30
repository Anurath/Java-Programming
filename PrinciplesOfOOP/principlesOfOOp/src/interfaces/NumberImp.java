package interfaces;

public class NumberImp implements Numbers {
	public boolean isPrime(int num)
	{
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public boolean isTechNumber(int num)
	{
		int lh = num/100;
		int rh = num%100;
		
		int sum = lh+rh;
		
		return sum*sum==num;
	}
	
	public int nextPrime(int num)
	{
		for(;;)
		{
			if(isPrime(num))
			{
				return num;
			}
			num++;
		}
	}
	
	@Override
	public int prevPrimeNumber(int num)
	{
		for(;;)
		{
			if(isPrime(num))
			{
				return num;
			}
			num--;
		}
	}
	
	@Override 
	public int factorial(int num)
	{
		int fact  = 1;
		while(num!=0)
		{
			fact*=num;
			num--;
		}
		return fact;
	}
	
	@Override
	public int sum(int num)
	{
		int sum = 0;
		while(num!=0)
		{
			sum+=num;
			num--;
		}
		return sum;
	}
}
