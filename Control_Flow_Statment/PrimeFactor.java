import java.util.Scanner;
class PrimeFactor
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i=2;i<num ;i++ )
		{
			if (num%i==0)
			{
				boolean flag = true;
				for (int j=2;j<i ;j++ )
				{
					if (i%j==0)
					{
						flag=false;
					}
				}
				if (flag)
				{
					System.out.println(i+" Prime Number.");
				}
				else
				{
					System.out.println(i+" Not Prime Number. ");
				}
			}
		}
	}
}