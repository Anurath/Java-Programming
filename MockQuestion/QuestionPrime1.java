import java.util.Scanner;
class QuestionPrime1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		for (int i=2;i<=num ;i++ )
		{
			System.out.println(i);
		}
	}
}