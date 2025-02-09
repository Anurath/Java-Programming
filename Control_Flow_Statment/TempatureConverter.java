import java.util.Scanner;
class TempatureConverter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter tempature in celsius : ");
		float celsius = sc.nextFloat();
		System.out.println("1.Convert to Fehrenheit");
		System.out.println("2.Convert to Kelvin");
		System.out.println("3.Convert to Rankine");
		System.out.print("Enter the option : ");
		int opt = sc.nextInt();
		switch(opt)
		{
			case 1:
			{
				float fer = (celsius*1.8f)+32;
				System.out.println("Celsius to Fehrenheit : "+fer+"F");
				break;
			}
			case 2:
			{
				float kel = (celsius+273.15f);
				System.out.println("Celsius to Kelvin : "+kel+"K");
				break;
			}
			case 3 : 
			{
				float ran = (celsius+273.15f)*1.8f;
				System.out.println("Celsius to Fehrenheit : "+ran+"R");
				break;
			}
		}
	}
}