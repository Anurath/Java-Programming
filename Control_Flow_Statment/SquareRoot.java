import java.util.Scanner;
class SquareRoot
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number  : ");
		boolean flag=false;
		int num = sc.nextInt();

		for (int i=1;i<num; i++)
		{
			if (i*i==num)
			{
				System.out.println("This number has perfect square root.");
				flag = true;
				return;
			}
			if ((i*i)>num)
			{
				break;
			}
		}
		if (!flag)
		{
			System.out.println("This numbe has not perfect square root.");
		}
	}
}