import java.util.Scanner;
class EMI1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount : ");
		double amount = sc.nextDouble();
		System.out.print("Enter the rate : ");
		float rate = sc.nextFloat();
		System.out.print("Enter the months : ");
		int month = sc.nextInt();

		double in= (amount*(month/12)*rate)/100;
		System.out.println("Interrest is : "+in);
		System.out.println("Amount : "+amount);
		System.out.println("Total to be payable : "+(in+amount));
		System.out.println("EMI payable : "+((in+amount)/12));
	}
}