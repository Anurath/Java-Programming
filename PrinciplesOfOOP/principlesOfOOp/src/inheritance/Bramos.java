package inheritance;

public class Bramos extends Missile {
	String type;
	int range;
	int speed;
	 
	Bramos(String type, int range, int speed,int year, int payload, String country)
	{
		this.type = type;
		this.range = range;
		this.speed = speed;
		this.year = year;
		this.country = country;
		this.payload = payload;
	}
	
	public void displayBramos()
	{
		displayMissile();
		System.out.println("Type: "+type);
		System.out.println("Range: "+range);
		System.out.println("Speed: "+speed);
	}
}
