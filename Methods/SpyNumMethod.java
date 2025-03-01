import java.util.Scanner;
class SpyNumMethod
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		System.out.println(checkSpy(num));
	}
	public static boolean checkSpy(int num)
	{
		int pro = 1;
		int sum=0;
		for (int i=num;i!=0 ;i/=10 )
		{
			sum+=(i%10);
			pro*=(i%10);
		}
		return pro==sum;
	}
}
