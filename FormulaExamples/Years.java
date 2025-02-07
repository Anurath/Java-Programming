import java.util.Scanner;
class Years
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the minutes : ");
		int minutes = sc.nextInt();
		int minuteYear= 365*24*60;
		int years= minutes/minuteYear;
		int days = (minutes%minuteYear)/(24*60);

		System.out.println("Years : "+years);
		System.out.println("Days :"+days);


	}
}