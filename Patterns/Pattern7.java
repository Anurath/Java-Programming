import java.util.Scanner;
class Pattern7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of pattern : " );
		int num = sc.nextInt();
		for (int i=0;i<num ;i++ )
		{
			for (int j=0;j<num-i ;j++ )
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}