import java.util.Scanner;
class ChaCheck
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		String ans = (ch>=65 && ch<=90)?"UpperCase":"Not Uppercase";
		System.out.print(ans);
	}
}