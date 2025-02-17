import java.util.Scanner;
class TechNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int cnt = 0;
		for (int i=num;i>0 ;i/=10 )
		{
			cnt++;
		}
		int div = 1;
		for (int i=0;i<cnt/2 ;i++ )
		{
			div*=10;
		}
		int fh = num/div;
		int lh = num%div;
		int sum = fh+lh;
		int sqr = sum*sum;
		if (sqr==num)
		{
			System.out.println("This number is tech number.");
		}
		else
		{
			System.out.println("This number is not tech number.");
		}
	}
}