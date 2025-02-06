import java.util.Scanner;
class UserVowels
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you name : ");
		String name= sc.next().toUpperCase();
		int len= name.length();
		for (int i=0;i<len;i++ )
		{
			char ch = name.charAt(i);
			if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				System.out.println("Vowel at : "+i+" "+ch);
			}
		}
	}
}