import java.util.Scanner;
class NeonNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int sqr = num*num;
		int sum =0;
		for (int i=sqr;i>0 ;i/=10 )
		{
			sum+=(i%10);
		}
		if (num==sum)
		{
			System.out.println("This number is Neon number.");
		}
		else
			System.out.println("This number is not Neon number.");
	}
}