import java.util.Scanner;
class Pattern2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		for (int i=0;i<num;i++ )
		{
			for (int j=0;j<num ;j++)
			{
				if (i==num/2||j==num/2||i==0||j==0||j==num-1||i==num-1)
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
