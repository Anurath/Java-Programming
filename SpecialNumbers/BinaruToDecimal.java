import java.util.Scanner;
class BinaruToDecimal
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Binary : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i= num,cnt=0;i>0 ;i/=10 ,cnt++)
		{
			int rem = i%10;
			if (rem==1)
			{
				sum+=(Math.pow(2,cnt));
			}
		}
		System.out.println(sum);
	}
}