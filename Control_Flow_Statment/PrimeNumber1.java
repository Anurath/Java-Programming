import java.util.Scanner;
class PrimeNumber1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		boolean flag=false;
		for (int i =2;i<=num/2;i++ )
		{
			if (num%i==0)
			{
				System.out.println("Number "+num+" is not prime number.");
				flag= true;
				return;
			}
		}
		if (!flag)
		{
			System.out.println("Number is a prime number.");
		}
	}
}