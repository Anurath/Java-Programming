import java.util.Scanner;
class EvilNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int cnt = 0;
		for (int i=num;i>0;i/=2 )
		{
			if((i%2)==1)
				cnt++;
		}
		if (cnt%2==0)
			System.out.println("The given number is Evil Number.");
		else
			System.out.println("The given number is not Evil Numeber.");
	}
}
