import java.util.Scanner;
class Percentage
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks :");
		float marks = sc.nextFloat();
		
		float per = (marks/600)*100;

		String ans = (per<=100||per>=75)? ("A"):( (per<75||per>=60)?("B"):(  (per<60||per>=35)?("C"):("Fail")  ) );
		System.out.print(ans);
	}
}