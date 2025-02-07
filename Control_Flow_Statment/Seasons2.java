import java.util.Scanner;
class Seasons2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String month = sc.next().toUpperCase();

		switch(month)
		{
			case "JUL":
			case "AUg":
			case "SEP":
			{
				System.out.println("Varsha");
				break;
			}
			case "OCT":
			case "NOV":
			{
				System.out.println("Sharad");
				break;
			}
			case "DEC":
			case "JAN":
			case "FEB":
			{
				System.out.println("Shishir");
				break;
			}
			case "MAR":
			case "APR":
			{
				System.out.println("Vasant");
				break;
			}
			case "MAY":
			case "JUN":
			{
				System.out.println("Grishma");
				break;
			}
			default:
			{
				System.out.print("INVILID MONTH");
			}
		}

	}
}