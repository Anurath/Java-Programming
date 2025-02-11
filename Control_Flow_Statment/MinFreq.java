import java.util.Scanner;
class MinFreq
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int min = 9;
		int dgt = 0;
		for (int i=0;i<=9;i++ )
		{
			int cnt= 0;
			for (int j=num;j>0 ;j/=10 )
			{
				int rem = j%10;
				if (rem==i)
				{
					cnt++;
				}
			}
			if (cnt>0)
			{
				if (cnt<min)
			    {
				  min= cnt;
				  dgt=i;
			    }
			}
		}
		System.out.println("The min count of digit "+dgt+" is "+min);
	}
}