import java.util.Scanner;
class AreaAndPerimeterOfCircle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the radius of circle : ");
		float radius = sc.nextFloat();

		final float pi=22/7;
		double area = pi*radius*radius;
		double perimeter =2*pi*radius;
		System.out.println("Area of circle is :" + area);
		System.out.println("Perimeter of circle is :" + perimeter);
	}
}