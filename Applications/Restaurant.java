import java.util.Scanner;
class Restaurant
{
		static String name;
		static long password;
		static String address;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		for (; ; )
		{
			System.out.println();
		    System.out.println("      JAVA KA DHABA");
			System.out.println();
			System.out.println("    1.CREATE AN ACCOUNT");
			System.out.println("    2.LOGIN");
			System.out.print("Enter the Option : ");
			int opt = sc.nextInt();
			switch(opt)
			{
				case 1: createAccount(sc);break;
				case 2: login(sc);break;
				default: System.out.println("INVALID INPUT");
			}
		}
	}

	public static void createAccount(Scanner sc)
	{
		System.out.println("REGISTER");
		System.out.print("Enter the Name : ");
		name = sc.next();
		System.out.print("Enter Password : ");
		password= sc.nextLong();
		sc.nextLine();
		System.out.print("Enter Address : ");
		address = sc.nextLine();
		System.out.println(name + ","+password+" , "+address );
	}
	public static void login(Scanner sc)
	{
		if(name==null && password==0)
		{
			System.out.println("CREATE ACCOUNT FIRST.");
		}
		else
		{
			for (int attempt=3;attempt>=1 ;attempt-- )
		{
			System.out.print("Enter Username : ");
			String loginUsername = sc.next();
			System.out.print("Enter Password : ");
			long loginPassword = sc.nextInt();
			if(loginPassword==password && name.equals(loginUsername))
			{
				homePage();
			}
			else
			{
				System.out.println("ATTEMPT LEFT "+ (attempt-1));
			}
		}
		System.out.println("THANK YOU , NEVER VISIT AGAIN.");
		System.exit(0);

		}
	}
	public static void homePage()
	{
		System.out.println("     HOME PAGE ");
		System.out.println();
		
	}
}