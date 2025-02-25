import java.util.Scanner;
class DemoParameterizedMethod
{
	public static void add(int a,int b)
	{
		int res = a+b;
		System.out.println(res);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number : ");
		int num2 = sc.nextInt();
		add(num1,num2);
	}
}