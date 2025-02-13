import java.util.Scanner;
class Pattern10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the pattern size : ");
		int num = sc.nextInt();

		for (int i=0;i<num ;i++ )
		{
			for (int j=0;j<num ;j++ )
			{
				if (j==0||i==0||j==num-1||i==num-1||j==i||j+i==num-1||j==num/2||i==num/2||i==num/4&&j>num/4&&j<num*3/4||
					j==num*3/4&&i>num/4&&i<num*3/4||i==num*3/4&&j>num/4&&j<num*3/4||j==num/4&&i>num/4&&i<num*3/4)
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