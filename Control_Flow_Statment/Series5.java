import java.util.Scanner;
class Series5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the series length : ");
		int len = sc.nextInt();

		for (int i=2 ;i<=len ;i++ )
		{
			int op=1;
			for (int j=0;j<3 ;j++ )
			{
				op*=i;
			}
			op+=i;
			System.out.println(op);
		}
	}
}