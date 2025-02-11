import java.util.Scanner;
class MaxDgt
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int dup= num;
		int max = 0 ;
		
		while(num>0)
		{
			int rem = num%10;
			if (max<rem)
			{
				max=rem;
			}
			num/=10;
		}
		System.out.println("The larget digit of "+dup+" is : "+max);
	}
}