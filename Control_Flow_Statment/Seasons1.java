import java.util.Scanner;
class Seasons1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the months first three leters : ");
		String mon = sc.next().toUpperCase();

		String season = (mon.equals("OCT")||mon.equals("NOV")||mon.equals("DEC")||mon.equals("JAN"))?("WINTER"):(  (mon.equals("FEB")||mon.equals("MAR")||mon.equals("APR")||mon.equals("AMY"))?("SUMMER"): ( (mon.equals("JUN")||mon.equals("JUL")||mon.equals("AUG")||mon.equals("SEP"))?("MONSOON"):("INVALID MONTH")  )  );
		System.out.print(season);

	}
}
