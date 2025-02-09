import java.util.Scanner;
class EvenOddConversion
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int temp= num;
		int count=0;
		
		while (num>0)
		{
			int rem = num%10;
			count++;
			num/=10;
		}
		if (count%2==0)
		{
			
		}
		else
		{
			
		}
	}
}