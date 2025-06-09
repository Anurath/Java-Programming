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
		System.out.println("Name: "+name);
		System.out.println("Guidance System: "+);
		System.out.println("Name: "+name);
	}
}
