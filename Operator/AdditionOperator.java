import java.util.Scanner;
class AdditionOperator
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int num1=sc.nextInt();
		System.out.print("Enter the second number :");
		int num2 =sc.nextInt();
		long op=num1+num2;
		System.out.println(op);
	}
}
