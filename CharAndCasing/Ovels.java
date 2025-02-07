import java.util.Scanner;
class Ovels
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Alphabate");
		char ch = sc.next().charAt();
		String ans = (ch=='o'||ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')?("Ovel"):("Not ovel");
		System.out.print(ans);
	}
}