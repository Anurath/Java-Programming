import java.util.Scanner;
class Balance
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Salery :");
		float salery = sc.nextFloat();
		
		System.out.print("Enter send Friend : ");
		float frSend = sc.nextFloat();

		System.out.print("Enter Received from Friend : ");
		float frRec = sc.nextFloat();

		System.out.print("ATM : ");
		float atm = sc.nextFloat();

		System.out.print("Deduct amound : ");
		float deduct = sc.nextFloat();

		float balance= salery-frSend-atm-deduct+frRec;

		System.out.print("Balance is : "+balance);


	}
}
