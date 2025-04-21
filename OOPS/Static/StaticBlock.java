import java.util.Scanner;
class StaticBlock
{
	static String name;
	public static void main(String[] args)
	{
		System.out.println("Main Method Starts");
		System.out.println(name);
		System.out.println("Main Method Ends");
	}
	static{
		System.out.println("From Static Block 1");
		writeName();
	}
	public static void writeName()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name: ");
		name = sc.next();
	}
}