import java.util.Scanner;
class SpyNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int sum=0,pro=1;
		for (int i=num;i>0 ;i/=10 )
		{
			int rem = i%10;
			sum+=rem;
			pro*=rem;
		}
		if (sum==pro)
			System.out.print("The numebr is Spy number.");
		else
			System.out.print("The number is not  Spy number.");
	}
}