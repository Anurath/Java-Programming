package superCallStatement;

public class CruiseMissile extends Missile{
	String launchPlatform;
	String tarrainFollowingSystem;
	
	CruiseMissile(){}
	
	CruiseMissile(int range,int weight,String manufacturer,String name,String guidSystem,String warheadType,String launchPlatform,String tarrainFollowingSystem)
	{
		super(range,weight,manufacturer,name,guidSystem,warheadType);
		
		this.launchPlatform = launchPlatform;
		this.tarrainFollowingSystem = tarrainFollowingSystem;
	}
	
	public void displayCruiseMissile()
	{
		displayMissile();
		
		System.out.println("Launch Platform: "+launchPlatform);
		System.out.println("Tarrain Following System: "+tarrainFollowingSystem);
	}
}
