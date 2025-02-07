import java.util.Scanner;
class OvelChech
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character : ");
		char ch = sc.next().charAt(0);

		String ans = (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')?("The given character is Ovel"):("The given character is not ovel");
		System.out.print(ans);
	}
}