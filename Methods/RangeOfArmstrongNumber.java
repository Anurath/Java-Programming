import java.util.Scanner;
class RangeOfArmstrongNumber
{
	public static void main(String[] args)
	{
		
	}
	public static boolean isArmstrong(int num)
	{
		int sum = 0;

		int len = power(num);

	}
	public static int power(int num)
	{
		int cnt =0;
		for (int i=num;i!=0 ;i/=10 )
		{
			cnt++;
		}
		return cnt;
	}
}