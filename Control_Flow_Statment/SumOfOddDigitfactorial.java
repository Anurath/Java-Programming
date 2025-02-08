import java.util.Scanner;
class SumOfOddDigitfactorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int sum=0;
		while (num>0)
		{
			int factorial=1;
			int rem = num%10;
			if (rem%2!=0)
			{
				for (int i=1;i<= rem;i++ )
				{
					factorial*=i;
				}
				sum+=factorial;
			}
			num/=10;
		}
		System.out.println("Addition of odd digit factorial is : "+sum);
	}
}