import java.util.Scanner;
class Voter
{
	public static void main(String[] args)
	{
		System.out.print("Enter your age : ");
		int age = new Scanner(System.in).nextInt();

		String res = age>=18 ? "You can vote" : "You can not Vote";

		System.out.print(res);

	}
}