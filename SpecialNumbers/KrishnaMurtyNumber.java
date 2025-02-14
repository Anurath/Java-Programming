import java.util.Scanner;
class  KrishNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : " );
		int num =  sc.nextInt();
		int sum = 0;
		for (int i=num;i>0 ;i/=10 )
		{
			int fact=1;
			int rem = i%10;
			for (int j=rem;j>0 ;j-- )
			{
				fact*=j;
			}
			sum+=fact;
		}
		if (sum==num)
		{
			System.out.print("Krish Number");
		}
		else
		{
			System.out.print("Not Krish Number."); 
		}
	}
}
