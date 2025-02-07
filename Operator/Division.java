import java.util.Scanner;
class Division
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();

		String ans =(num%2==0&&num%5==0?("Hi Two Hi Five"):   ((num%2==0)?("Hi two"):(  (num%5==0)?"HI five":"Blanck"  ))      );

		System.out.print(ans);
	}
}