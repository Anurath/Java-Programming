import java.util.Scanner;
import java.util.Date;
class Bank
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String[] arr = new String[20];
		String username1=null;
		String password1=null;
		long phone1 = 0;
		double balance =0;
		String address1=null;

		for (; ; )
		{
		   System.out.println("     WELCOME     ");
		   System.out.println(" LAKSHMI CHIT FUND ");
		   System.out.println();
		   System.out.println("1.LOGIN ACCOUNT");
		   System.out.println("2.CREATE ACCOUNT");
		   System.out.println();
		   System.out.print("Enter the option : ");
		int opt = sc.nextInt();
		if (opt==1)
		 {
			if (username1==null&&password1==null)
			{
				System.out.println("CREATE ACCOUNT FIRST");
				System.out.println();
				continue;
			}
			else
			 {   Home:
				for (int i=3;i>=1 ;i-- )
				{
					
					System.out.print("Enter username : ");
					String usernameLogin= sc.next();
					System.out.print("Enter password : ");
					String passwordLogin=sc.next();
					int captcha = (int)(Math.random()*10000);
					System.out.println(captcha);
					System.out.print("Enter Captcha : ");
					int captcha1=sc.nextInt();
					if (captcha!=captcha1)
					{
						System.out.println("INVALID CAPTCHA");
						continue;
					}
					if (usernameLogin.equals(username1)&&passwordLogin.equals(password1))
					{
						Loged:
						for (; ; )
						{
							System.out.println();
							System.out.println("1.Depoiste Amount");
						    System.out.println("2.Check Balance");
						    System.out.println("3.Withdraw Money");
						    System.out.println("4.Logout");
							System.out.println("5.Update Information");
							System.out.println("6.Transaction History");
						    System.out.print("Enter option : ");
						    int opt1= sc.nextInt();
							switch(opt1)
						    {
							   case 1:
							   {
								 System.out.print("Enter amount : ");
								 double deposite = sc.nextDouble();
								 balance+=deposite;
								 Date currDate = new Date();
								 String depositeStatus =currDate+ " Deposite : "+deposite+" Current Balance :"+balance;
								 for (int a1=0 ;a1<arr.length ; a1++)
								 {
									 if (arr[a1]==null)
									 {
										arr[a1]=depositeStatus;
										break;
									 }
								 }
								 break;
							   }
							   case 2:
							   {
								 for (int j=3;j>=1 ;j-- )
								 {
									 System.out.print("Enter PIN : ");
									 String pin = sc.next();
									 if (pin.equals(password1))
									 {
										System.out.println("Balance : "+balance);
										System.out.println();
									    continue Loged;
									 }
									 else
									 {
										System.out.println("INVALID CREDENTIALS");
										System.out.println("Attempt left "+(i-1));
									 }
								 }
								 System.out.println("YOUR ACCOUNT HAS BLOCKED FOR 24 HOURS");
								 System.exit(0);
							   }
							   case 3:
							   {
								 for (int l=3;i>=1 ; l--)
								 {
									 System.out.print("Enter the PIN : ");
									 String withdrawPIN = sc.next();
									 if (withdrawPIN.equals(password1))
									 {
										 System.out.print("Enter amount : ");
										 double withdrawAmount = sc.nextDouble();
										if (withdrawAmount>balance)
										{
											System.out.println("INSUFFICIENT FUNDS");
											continue Loged;
										}
										else
										 {
										 balance-=withdrawAmount;
										 System.out.println("Amount debeted.");
										 System.out.println("Current balace = "+balance);
										 System.out.println();
										 Date currDate = new Date();
										 String withdrawStatus =currDate+ " Withdraw : "+withdrawAmount+" Current Balance :"+balance;
								         for (int a2=0 ;a2<arr.length ; a2++)
								         {
									        if (arr[a2]==null)
									        {
										    arr[a2]=withdrawStatus;
										    break;
									       }
								         }
										 continue Loged;
										 }
									 }
									 else
									 {
										System.out.println("INVALID PIN");
										System.out.println("Attempt left : "+(l-1));
										continue ;
									 }
								 }
								 System.out.println("YOUR ACCOUNT HAS BLOCKED FOR 24 HOURS.");
							     System.exit(0);
							   }
							   case 4:
							   {
								 System.out.println("THANK YOU");
								 System.out.println("VISIT AGAIN");
								 System.out.println();
								 System.exit(0);
							   }
							   case 5:
								{
									for (int m=3;m>=1 ;m-- )
									{
										System.out.print("Enter the PIN : ");
										String updatePIN = sc.next();
										if (updatePIN.equals(password1))
										{
											System.out.println();
											System.out.println("1.Change Username");
											System.out.println("2.Change Password");
											System.out.println("3.Change Phone Number");
											System.out.println("4.Change Address");
											System.out.println();
											System.out.print("Enter the opt : ");
											int upOpt = sc.nextInt();

											switch(upOpt)
											{
												case 1:
												{
													System.out.print("Enter new Username : ");
													String newUserName=sc.next();
													username1=newUserName;
													continue Loged;
												}
												case 2:
												{
													System.out.print("Set new password : ");
													String newPassword = sc.next();
													password1=newPassword;
													continue Loged;
												}
												case 3:
												{
													System.out.print("Change Phone Number : ");
													long newPhone = sc.nextLong();
													phone1=newPhone;
													continue Loged;
												}
												case 4:
												{
													System.out.print("Change Address : ");
													String newAddress = sc.nextLine();
													address1= newAddress;
													continue Loged;
												}
												default:
												{
													System.out.println("INVALID INPUT");
													continue Loged;
												}
											}
										}
										else
										{
											System.out.println("INVALID CREDENTIALS");
											System.out.println("Atempt Left"+(m-1));
										}
									}
									System.out.println("YOUR ACCOUNT HAS BLOCKED FOR 24 HOURS");
									System.exit(0);
								}
							  case 6:
							  {
								for (int a3=0;a3<arr.length;a3++ )
								{
									if (arr[a3]!=null)
									{
										System.out.println(arr[a3]);
									}
								}
								break;
							  }
							  case 7:
								{
									Date currDate = new Date();
									System.out.println(currDate);
								}
						  }
						}
					}
					else
					{
						System.out.println("INVALID CREDENTIALS");
						System.out.println("Attempt left : "+(i-1));
					}
				}
				System.out.println("YOUR ACCOUNT HAS BLOCKED FOR 24 HOURS.");
				System.exit(0);
			 }
		 }else if (opt==2)
		 {
			System.out.print("Enter userame : ");
			String username = sc.next();
			username1=username;

			System.out.print("Enter password : ");
			String password = sc.next();
			password1=password;

			System.out.print("Enter Contact Number : ");
			long phone = sc.nextLong();
			phone1= phone;

			sc.nextLine();

			System.out.print("Enter Address : ");
			String address = sc.nextLine();
			address1=address;

			System.out.print("Enter the deposite : ");
			double deposite = sc.nextDouble();
			balance = deposite;
			
			System.out.println(username1);
			System.out.println(password1);
			System.out.println(phone1);
			System.out.println(balance);
			System.out.println(address1);

		 }
		else
		 {
			System.out.println("INVALID INPUT");
			System.out.println("  TRY AGAIN  ");
			System.out.println();
		 }
		}
	}
}
