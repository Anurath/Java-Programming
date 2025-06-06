package inheritance;

public class Missile {
	int year;
	int payload;
	String country;
	
	Missile(){}
	
	Missile(int year,int payload,String country)
	{
		this.year = year;
		this.payload = payload;
		this.country = country;
	}
	
	public void displayMissile()
	{
		System.out.println("Year: "+year);
		System.out.println("Payload Capacity: "+payload);
		System.out.println("Country: "+country);
	}
}
