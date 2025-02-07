import java.util.Scanner;
class PoundToKg
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the weight in pounds :");
		float pound= sc.nextFloat();

		double kg= pound*0.453592;

		System.out.print("Converted weight of Pound into Kg is :"+kg+"kg");

	}
}