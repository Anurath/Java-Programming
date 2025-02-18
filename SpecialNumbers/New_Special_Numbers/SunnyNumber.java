import java.util.Scanner;
class SunnyNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		num+=1;
		for (int i=1;i<num ;i++ )
		{
			int sqr = i*i;
			if (sqr==num)
			{
				flag = true;
				break;
			}
			if (sqr>num)
			{
				break;
			}
		}
		if(flag)
			System.out.println("The given numebr is Sunny number.");
		else
			System.out.println("The given number is not Sunny number.");
	}
}