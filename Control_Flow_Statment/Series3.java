import java.util.Scanner;
class Series3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter series : ");
		int len = sc.nextInt();
		int startNum = 56;
		int updateNum = 23;

		for (int i=0;i<len ;i++ )
		{
			updateNum++;
			for (int j=0;j<i;j++ )
			{
				if (updateNum%j==0)
				{
					updateNum++;
					j=0;
				}
			}
			startNum+=updateNum;
			System.out.println(startNum);
		}
	}
}