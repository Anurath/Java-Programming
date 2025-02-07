import java.util.Scanner;
class LowerUpperOrDigit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character : ");
		char ch = sc.next().charAt(0);

		String ans = (ch>=48&&ch<='9')?("The given character is digit"):(  (ch>=65&&ch<=90)?("The give character is UpperCase"):(   (ch>=97&&ch<=122)?("The given character is LowerCase"):("The character is Special.")   )  );
		System.out.print(ans);	
	}
}