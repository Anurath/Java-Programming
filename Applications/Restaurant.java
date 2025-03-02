import java.util.Scanner;
class Restaurant
{
		static String name;
		static long password;
		static String[] basket = new String[10];
		static int[] price = new int[10];
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
				homePage(sc);
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
	public static void homePage(Scanner sc)
	{
		for (; ; )
		{
			System.out.println();
			System.out.println(" Home Page" );
			System.out.println("1.MENU");
			System.out.println("2.ORDERS");
			System.out.println("3.TABLE BOOKING");
			System.out.println("4.LOGOUT");
			System.out.print("Enter Option : ");
			int opt = sc.nextInt();
			switch (opt)
			{
				case 1:
				{
					menu(sc);break;
				}
				case 2:
				{
					orders(sc);break;
				}
				case 3:
				{
					tableBooking();break;
				}
				case 4:
				{
					System.out.println("VISIT AGAIN");
					System.exit(0);
				}
				default:
				{
					System.out.println("INVALID INPUT");
				}
			}
		}
	}
	public static void menu(Scanner sc)
	{
		for (; ; )
		{
		System.out.println("MENU");
		System.out.println("101.PURAN POLI");
		System.out.println("102.KAJU PANEER");
		System.out.println("103.CHICKEN BIRYANI");
		System.out.println("104.ROTI");
		System.out.println("105.BACK TO HOME PAGE");
		System.out.print("Enter the cousine ID : ");
		int id = sc.nextInt();
		switch(id)
		{
			case 101:
			{
				for (int i=0;i<basket.length ;i++ )
				{
					if(basket[i]==null)
					{
						basket[i]="101.PURAN POLI";
						price[i]=200;
						break;
					}
				}
				break;
			}
			case 102:
			{
				for (int i=0;i<basket.length ;i++ )
				{
					if(basket[i]==null)
					{
						basket[i]="102.KAJU PANEER";
						price[i]=300;
						break;
					}
				}
				break;
			}
			case 103:
			{
				for (int i=0;i<basket.length ;i++ )
				{
					if(basket[i]==null)
					{
						basket[i]="103.CHICKEN BIRYANI";
						price[i]=200;
						break;
					}
				}
				break;
			}
			case 104:
			{
				for (int i=0;i<basket.length ;i++ )
				{
					if(basket[i]==null)
					{
						basket[i]="104.ROTI";
						price[i]=50;
						break;
					}
				}
				break;
			}
			case 105:
			{
				return;
			}
		 }
		}
	}
	public static void orders(Scanner sc)
	{
		System.out.println("ORDERS ");
		System.out.println("1.Show Orders List");
		System.out.println("2.Back Home Page");
		System.out.print("Enter Optoin : ");
		int opt = sc.nextInt();
		switch(opt)
		{
			case 1:
			{
				for (int i=0;i<basket.length;i++ )
				{
					if(basket[i]!=null)
					{
						System.out.print(basket[i]);
						System.out.println(" "+price[i]+"/-");
					}
				}
				break;
			}
			case 2:
				return;
		}
	}
	public static void tableBooking()
	{
		System.out.println("Method Not Created Yet.");
	}
}