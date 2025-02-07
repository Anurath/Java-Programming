import java.util.Scanner;
class PercentageBonus
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int bonus=0;
		float totalMarks = 0;
		for(int i=1;i<=5;i++)
		{
			System.out.print("Enter the marks of subject "+i+" : ");
			float subMark = sc.nextFloat();
			totalMarks+=subMark;
		}
		System.out.print("Student has perfect attendance (YES/NO) : ");
		String attendance = sc.next().toUpperCase();
		System.out.print("Student participated in extracurricular activities (YES/NO) : ");
		String participation = sc.next().toUpperCase();
		
		float bonusWithTotalMarks = (attendance.equals("YES")&&participation.equals("YES"))?(totalMarks+10):( (participation.equals("YES"))?(totalMarks+3):( (attendance.equals("YES"))?(totalMarks+5):(0) ) );

		float average = bonusWithTotalMarks/5;

		float percentage = (average>100)?(100):(average);

		String grade = (average>=75)?("A"):(  (average>=60)?("B"):(   (average>=35)?("C"):("FAIL")   )  );
		System.out.println("Marks Obtained : "+(totalMarks));
		System.out.println("Total Marks Obtained After Bonus : "+bonusWithTotalMarks);
		System.out.println("Bonus Marks You Got Is : "+(bonusWithTotalMarks-totalMarks));
		System.out.println("Percentage : "+percentage);
		System.out.println("GRADE : "+grade);

	}
}