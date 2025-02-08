import java.util.Scanner;
class LeetCodeReverseNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		long rev=0;
		boolean flag=false;
		if (num<0)
		{
			num=num*(-1);
			flag= true;
		}

		while (num>0)
		{
			int rem = num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if (rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE)
		{
			System.out.print(0);
			//return 0;
			
		}
		else
		{
		if (flag)
		{
			rev=(-1)*rev;
			System.out.print(rev);
			//return rev;
		}
		else
		{
			System.out.print(rev);
			//return rev;
		}
		}
	}
}