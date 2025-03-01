import java.util.Scanner;
class PalindromeMethod
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		if(isPalindrome(num)&&isPrime(num))
			System.out.println("The given number is Palindromic Prime Number.");
		else
			System.out.println("The given number is not Palindromic Prime Number.");
	}
	public static boolean isPrime(int num)
	{
		int den = 2;
		for (;den<num ;den++ )
			if(num%den==0)
				break;
		return den==num;
	}
	public static boolean isPalindrome(int num)
	{
		int rev = 0;
		for (int i=num;i!=0;i/=10)
			rev = rev*10+(i%10);
		return rev==num;
	}
}