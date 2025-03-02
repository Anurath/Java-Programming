import java.util.Scanner;
class RangeOfArmstrongNumber
{
	public static void main(String[] args)
	{
		for (int i=1;i<1000;i++ )
		{
			if (isArmstrong(153))
			{
				System.out.println(i);
			}
		}
	}
	public static boolean isArmstrong(int num)
	{
		int sum = 0;
		int len = power(num);
		for (int i=num;i!=0 ;i/=10 )
		{
			sum+=resTo((i%10),len);
		}
		return num==sum;
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
	public static int resTo(int num , int len)
	{
		int op = 1;
		for (int i=0;i<len ;i++ )
		{
			op*=num;
		}
		return op;
	}
}