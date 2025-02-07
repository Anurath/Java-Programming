import java.util.Scanner;
class PercentageCalculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Total marks  :");
		float totalMarks = sc.nextFloat();
		System.out.print("Enter the percentage :");
		float passPercentage = sc.nextFloat();
		System.out.print("Enter the Obtained Marks :");
		float optMarks = sc.nextFloat();

		float per = (optMarks*100)/totalMarks;

		String grade = (per<=100&&per>=90)?("Grade A "+"with "+per+"%"):(  (per>80)?("Grade B "+"with "+per+"%"):(  (per>60)?("Grade C "+"with "+per+"%"):(   (per>35)?("Grade B "+"with "+per+"%"):("Fail, Good luck next time.")   )   )  );
		System.out.println(grade);
	}
}