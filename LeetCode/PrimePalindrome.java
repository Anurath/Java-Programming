import java.util.Scanner;
class PrimePalindrome
{
	public static void main(String[] agrs)
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int dup=num;
		int rev = 0;
		for (int i=2;i<num;i++ )
		{
			if(num%i==0)
			{
				num++;
				i=2;
			}
		}

	}
}