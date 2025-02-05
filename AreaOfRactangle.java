import java.util.Scanner;
class AreaOfRactangle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter breadth of ractangle : ");
		float breadth = sc.nextFloat();

		System.out.print("Enter length of ractangle : ");
		float length = sc.nextFloat();

		double area = length*breadth;
		double perimeter = 2*(length+breadth);

		System.out.println("Area of ractangle is "+ area);
		System.out.println("Perimeter of ractangle is :" + perimeter);

	}
}