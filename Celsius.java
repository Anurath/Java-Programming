import java.util.Scanner;
class Celsius
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the celsius count : ");
		float celsius = sc.nextFloat();
		double fer = (9.0/5)*celsius+32;
		System.out.println("Given celsius in Fehrenheit : " + fer);
	}
}