import java.util.Scanner;
class EMI
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount : ");
		float amount = sc.nextFloat();
		System.out.print("Enter the Interest Rate : ");
		float interestRate = sc.nextFloat();
		System.out.print("Enter the Month : ");
		int months = sc.nextInt();

		String str = (months/12)+"."+(months%12);
		float con = Float.parseFloat(str);
		
		
		float yearInt = amount*interestRate/100;
		
		float totalInterest = yearInt*con;
		System.out.println(totalInterest);
		System.out.println(totalInterest+amount);

	}
}
