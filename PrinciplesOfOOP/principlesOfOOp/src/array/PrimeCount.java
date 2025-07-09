package array;

public class PrimeCount {

	public static void main(String[] args)
	{
		int[] arr = {12,32,31,32,37,47,11,5,4,71,78,79,97};
		int primeCount = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(isPrime(arr[i]))
			{
				primeCount++;
			}
		}
		System.out.println(primeCount);
	}
	public static boolean isPrime(int num)
	{
		if(num==1)
		{
			return false;
		}
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
