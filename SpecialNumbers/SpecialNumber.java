import java.util.Scanner;
class SpecialNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int sum = 0;
		int product = 1;
		for (int i = num;i>0 ;i/=10)
		{
			int rem = i%10;
			product*=rem;
			sum+=rem;
		}
		int finalSum = sum+product;
		if (finalSum==num)
		{
			System.out.println("The given number is special number.");
		}
		else
			System.out.println("The given number is not special number.");
	}
}