package arraysProblems;

public class TrainlingZerosInFact {

	public static void main(String[] args)
	{
		
	}
	
	public static int factorial(int num)
	{
		int fact = 1;
		while(num!=0)
		{
			fact*=num;
			num--;
		}
		return fact;
	}
	
	public static int trailZeros(int num)
	{
		int cnt=0;
		while(num!=0)
		{
			if(num%10==0)
			{
				cnt++;
			}
			num/=10;
		}
		return cnt;
	}
}
