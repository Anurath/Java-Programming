import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args)
	{
		System.out.print("Enter the number : ");
		int num = new Scanner(System.in).nextInt();

		String ans = (num==2||num==3)?("Number prime number."):((num%2==0||num%3==0)?("Number is not prime."):("Number is prime."));
		System.out.print(ans);
	}
}