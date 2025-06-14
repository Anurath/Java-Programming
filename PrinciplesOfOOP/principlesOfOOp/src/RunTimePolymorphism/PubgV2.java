package RunTimePolymorphism;

public class PubgV2 extends Pubg {
	public void turnRight()
	{
		System.out.println("Turn right");
	}
	
	public void stepBackward(int steps)
	{
		System.out.println("Went backward "+steps);
	}
}
