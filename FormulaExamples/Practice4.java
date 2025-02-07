import java.util.Scanner;
class Practice4
{
	public static void main(String[] agrs)
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			System.out.print("Hit enter : ");
			char ch= sc.next().charAt(0);
			double ramNum = Math.floor(Math.random()*100);
		    System.out.println(ramNum);
		}
	}
}