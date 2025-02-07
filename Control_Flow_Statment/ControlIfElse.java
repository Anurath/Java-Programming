import java.util.Scanner;
class ControlIfElse
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int num = sc.nextInt();

		if (num>=18)
		{
			System.out.print("You can vote.");
		}
		else
		{
			System.out.print("You can not vote");
		}
	}
}