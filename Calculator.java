import java.util.Scanner;
class Calculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		float num1 = sc.nextFloat();
		System.out.print("Enter the Operator : ");
		char op = sc.next().charAt(0);
		System.out.print("Enter the second number : ");
		float num2 = sc.nextFloat();

		float ans= (op=='+')?(num1+num2):(  (op=='-')?(num1-num2):(   (op=='*')?(num1*num2):(  (op=='/')?(num1/num2):(   (op=='%')?(num1%num2):(0.00001f)   )  )   )  );

		if (!(ans==0.00001f))
		{
			System.out.print(ans);
		}
	}
}
