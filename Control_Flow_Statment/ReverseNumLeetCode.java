import java.util.Scanner;
class ReverseNumLeetCode
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		long rev = 0;
		
		while (num>0)
		{
			int rem= num%10;
			rev = rev*10+rem;
			num/=10;
		}
		if (rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE)
			{
				System.out.print(0);
				return;
			}
		else
		{
			System.out.println(rev);
		}
	}
}