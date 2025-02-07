import java.util.Scanner;
class EvenOdd1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number : ");
		int num= sc.nextInt();

		String ans = num%2==0 ? "Positive Number" : "Negative Number";
		System.out.print("The Given number is :"+ans);
	}
}