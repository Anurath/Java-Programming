class RecArmstrongNumber
{
	public static void main(String[] args)
	{
		
		System.out.println(isArmStrong(153,153,0));
	}
	public static int len(int num,int cnt)
	{
		return num==0?cnt:len(num/10,++ cnt);
	}
	public static int power(int base,int raise,int op)
	{
		return raise==0?op:power(base,--raise,op*=base);
	}
	public static boolean isArmStrong(int num,int temp,int sum)
	{
		if (num==0)
		{
			return sum==temp;
		}
		sum+=power(num%10,len(temp,0),1);
		return isArmStrong(num/10,temp,sum);
	}
}

