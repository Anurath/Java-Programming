import java.util.Scanner;
class TriangleNumberPattern
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		for (int i=1;i<=num ;i++ )
		{
			//for printing spaces
			for (int j=1;j<=num-i ;j++ )
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i);
				System.out.print(" ");
				if (num>=10)
				{
					if (i<10)
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}
	}
}