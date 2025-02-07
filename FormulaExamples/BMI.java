import java.util.Scanner;
class BMI
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter wieght in pounds : ");
		float weight= sc.nextFloat();

		System.out.print("Enter height in Inches : ");
		float height = sc.nextFloat();

		weight = weight*(0.45359237f);
		height = height*(0.0245f);


		float bmi = weight/(height*height);
		System.out.println("Your BMI is : "+bmi);
	}
}
