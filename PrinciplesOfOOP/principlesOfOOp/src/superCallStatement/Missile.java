package superCallStatement;

public class Missile extends Weapon {
	String name;
	String guidSystem;
	String warheadType;
	
	Missile(){}
	
	Missile(int range,int weight,String manufacturer,String name,String guidSystem,String warheadType)
	{
		super(range,weight,manufacturer);
		
		this.name = name;
		this.guidSystem = guidSystem;
		this.warheadType = warheadType;
	}
	
	public void displayMissile()
	{
		displayWeapon();
		System.out.println("Name: "+name);
		System.out.println("Guidance System: "+guidSystem);
		System.out.println("Warhead Type: "+warheadType);
	}
}
