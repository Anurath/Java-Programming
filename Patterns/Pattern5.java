import java.util.Scanner;
class Pattern5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pattern size : ");
		int num = sc.nextInt();
		for (int i=0;i<num ;i++ )
		{
			for (int j=0;j<num ;j++ )
			{
				if (i==num/4||i==num*3/4||j==num/4||j==num*3/4||i==0&&j>num*3/4||j==num-1&&i<num/4||j==num-1&&i>num*3/4||i==num-1&&j<num/4||i==num-1&&j>num*3/4||j==0&&i<num/4||j==0&&i>num*3/4||i==0&j<num/4||i==num/2&&j==num/2||i==j||j+i==num-1)
				{
					System.out.print("*"+ " ");
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
