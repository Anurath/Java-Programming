import java.util.Scanner;
class Stocks
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("------WELCOME-------");
		System.out.println("1.Energy");
		System.out.println("2.Customer Services");
		System.out.println("3.Textile");
		System.out.println("4.Mining");
		System.out.println("5.Defence");
		System.out.println("6.Railway");

		System.out.print("Enter above option for respective stocks : ");
		int opt = sc.nextInt();

		switch(opt)
		{
			case 1:
			{
				System.out.println("");
				System.out.println("Adani Green Energy");
				System.out.println("NTPC");
				System.out.println("JSW");
				System.out.println("Suzlon Energy");
				System.out.println("Orient Green Power");
				break;
			}
			case 2:
			{
				System.out.println("");
				System.out.println("International Ge");
				System.out.println("Zee Media Cooperation");
				System.out.println("Yatra Online");
				System.out.println("Nestle India");
				System.out.println("P & G Hygiene");
				break;
			}
			case 3:
			{
				System.out.println("");
				System.out.println("Alstone Textiles");
				System.out.println("Cotton");
				System.out.println("Alok Industries");
				System.out.println("Jindal Worldwide");
				break;
			}
			case 4:
			{
				System.out.println("");
				System.out.println("Vedanta");
				System.out.println("Tata Steel");
				break;
			}
			case 5:
			{
				System.out.println("");
				System.out.println("HAL");
				System.out.println("Adani Defence");
				break;
			}
			case 6:
			{
				System.out.println("");
				System.out.println("Indian Railway");
				System.out.println("RCI");
				break;
			}
			default:
			{
				System.out.println("");
				System.out.println("INVALID INPUT");
			}
		}
	}
}