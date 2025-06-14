package RunTimePolymorphism;

public class Pubg {
	int bullets = 30;
	public void turnLeft()
	{
		System.out.println("Turned Left");
	}
	
	public void turnRight()
	{
		System.out.println("Turner Left");
	}
	
	public void fire()
	{
		if(bullets>0)
		{
			bullets--;
			System.out.println("Fired!");
			System.out.println("Bullets Left "+bullets);
		}
		else
		{
			System.out.println("Reload.");
		}
	}
	
	public void reload()
	{
		bullets= 30;
		System.out.println("Reloaded");
	}
	
	public void stepForward(int steps)
	{
		System.out.println("Went Forward "+steps);
	}
	
}
