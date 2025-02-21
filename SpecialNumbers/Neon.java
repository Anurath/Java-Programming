import java.util.Scanner;
class  Neon
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int sqr = num*num;
		for (int i=sqr;i>0 ;i/=10 )
		{
			sum+=i%10;
		}
		if (num == sum)
		{
			System.out.print("Neon Number.");
		}
		else
			System.out.print("Not neon number .");
	}
}
