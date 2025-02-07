import java.util.Scanner;
class CharacterFinding
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Strgin :");
		char ch=sc.next().charAt(0);
		System.out.print(ch);
		sc.nextLine();
		System.out.print("Enter another String : ");
		String str=sc.nextLine();
		System.out.print(str);
	}
}
