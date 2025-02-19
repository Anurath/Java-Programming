import java.util.Scanner;
class AutomorphicNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int div =1;
		for (int i=num;i>0;i/=10 )
		{
			div*=10;
		}
		int lastNumber = (num*num)%div;
		if (num==lastNumber)
		{
			System.out.println("Given number is Automorphic Number.");
		}
		else
			System.out.println("Given number is not Automorphic Number.");
	}
}