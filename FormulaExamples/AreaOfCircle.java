import java.util.Scanner;
class AreaOfCircle
{
	public static void main(String[] args)
	{
		final double pi=22/7;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the radius   : ");
		int r=sc.nextInt();
		double area= pi*r*r;
		System.out.print("The area for the given raduis for the circle is : "+ area);
	}
}