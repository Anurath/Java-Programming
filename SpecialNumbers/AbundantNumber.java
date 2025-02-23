import java.util.Scanner;
class AbundantNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i=1;i<num ;i++ )
		{
			if (i>(num/2))
				break;
			if (num%i==0)
				sum+=i;
		}
		if (num<sum)
			System.out.println("The given number is Abundant Number.");
		else
			System.out.println("The give number is not Abundant Number.");
	}
}