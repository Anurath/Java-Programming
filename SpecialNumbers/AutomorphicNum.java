import java.util.Scanner;
class AutomorphicNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : " );
		int num = sc.nextInt();
		int div=1;
		for (int i=num;i>0 ;i/=10 )
		{
			div*=10;
		}
		if ((num*num)%div==num)
		{
			System.out.println("Number is Automorphic number .");
		}
		else
			System.out.println("Not a Automorphic number.");
	}
}
