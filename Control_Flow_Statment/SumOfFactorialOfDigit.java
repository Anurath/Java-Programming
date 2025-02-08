import java.util.Scanner;
class SumOfFactorialOfDigit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int sum = 0;
		while (num>0)
		{
			int rem = num%10;
			int factorial=1;
			for (int i=1;i<=rem ;i++ )
			{
				factorial*=i;
			}
			sum+=factorial;
			num/=10;
		}
		System.out.println(sum);
	}
}