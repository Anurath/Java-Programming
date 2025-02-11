import java.util.Scanner;
class DoWhile1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int atp=3;
		int sPIN=1234;
		do
		{
			System.out.print("Entert the PIN : ");
			int pin = sc.nextInt();
			if (pin==sPIN)
			{
				System.out.println("Login Success");
				break;
			}
			else{
				System.out.println("Invalid PIN");
				System.out.println("Atempt left :"+(atp-1));
				atp--;
			}
		}
		while (atp>0);
		if (atp==0)
		{
			System.out.println("Blocked");
		}
	}
}