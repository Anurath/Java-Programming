class Prime
{
	public static void main(String[] args)
	{
		System.out.println(isPrime(2,23));
	}
	public static boolean isPrime(int den, int num)
	{
		if(num==den)
		{
			return true;
		}
		else if(num%den==0)
		{
			return false;
		}
		return isPrime(++den,num);
	}
}
