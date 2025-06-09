package superCallStatement;

public class Weapon {
	int range;
	int weight;
	String manufacturer;
	
	Weapon(){}
	
	Weapon(int range,int weight,String manufacturer)
	{
		this.range = range;
		this.weight = weight;
		this.manufacturer = manufacturer;
	}
	
	public void displayWeapon()
	{
		System.out.println("Range: "+range);
		System.out.println("Weight: "+weight);
		System.out.println("Manufacturer: "+manufacturer);
	}
}
