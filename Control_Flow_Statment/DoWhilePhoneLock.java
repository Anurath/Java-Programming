import java.util.Scanner;
class DoWhilePhoneLock
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int second= 5000;
		int storedPIN= 12345;
		int attempt=3;
		do
		{
			System.out.print("ENTER PASSWORD : ");
			int userPIN = sc.nextInt();
			if (storedPIN==userPIN)
			{
				System.out.println("PHONE UNLOCKED");
				break;
			}
			else
			{
				System.out.println("WRONG PASSWORD "+" ATTEMPT LEFT :"+(attempt-1));
				attempt--;
				if (attempt==0)
				{
					attempt=3;
					System.out.println("PHONE LOCKED FOR "+(second/1000)+"seconds");
					Thread.sleep(second);
					second+=second;
				}
			}
		}
		while (attempt>=1);
	}
}