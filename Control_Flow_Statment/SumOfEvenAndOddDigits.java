import java.util.Scanner;
class SumOfEvenAndOddDigits
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int evenSum=0;
		int oddSum=0;

		while (num>0)
		{
			int rem = num%10;
			if (rem%2==0)
			{
				evenSum+=rem;
			}
			else
			{
				oddSum+=rem;
			}
			num/=10;
		}
		System.out.println("Addition of the Even digit is : "+evenSum);
		System.out.println("Addition of the Odd digit is : "+oddSum);
	}
}