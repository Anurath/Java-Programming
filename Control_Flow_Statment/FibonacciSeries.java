import java.util.Scanner;
class FibonacciSeries
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count : ");
		int count = sc.nextInt();
		int num1=0;
		int num2=1;
		for (int i=0;i<count ;i++ )
		{
			if (i==0)
			{
				System.out.println(num1);
			}
			else if (i==1)
			{
				System.out.println(num2);
			}
			else
			{
				int temp=num2;
				num2=num2+num1;
				num1=temp;
				System.out.println(num2);
			}
		}
	}
}