import java.util.Scanner;
class NumberSeries
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int len = 0;
		for (int i=num;i>0 ;i/=10 )
		{
			len++;
		}
		int div=1;
		for (int i=0;i<len ;i++ )
		{
			div*=10;
		}
		int fh = num/div;
		int lh = num%div;
		int sum = fh+lh;
		int sqr = sum*sum;
		System.out.println(num);
		System.out.println(sum);
		if (sqr==num)
		{
			System.out.println("Tech");
		}
		else
		{
			System.out.println("Not Tech");
		}
	}
}