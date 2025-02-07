import java.util.Scanner;
class EvenOdd2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number : ");
		int num = sc.nextInt();

		String ans= (num/2)*2==num ? "Even Number":"Odd Number";
		System.out.print("The given number is : "+ans);
	}
}