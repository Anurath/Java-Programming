import java.util.Scanner;
class VolumeOfCylinder
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the radius of cylinder : ");
		float radius = sc.nextFloat();

		System.out.print("Enter height of cylinder : ");
		float height = sc.nextFloat();
		final double pi =22/7f;
		double area = pi*(radius*radius);
		double volume = (pi*radius*radius)*height;
		System.out.println("Volume of cylinder is  : " + volume);
		System.out.print("Area of cylinder is : " + area);

	}
}