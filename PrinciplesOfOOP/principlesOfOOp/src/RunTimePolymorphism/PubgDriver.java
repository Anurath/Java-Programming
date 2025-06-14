package RunTimePolymorphism;

public class PubgDriver {
	public static void main(String[] args)
	{
		
		//before adding PubgV2 to solve the bugs
//		Pubg p1 = new Pubg();
		
//		p1.turnLeft();
//		p1.turnRight();  
//		
//		p1.stepBackward(20);
//		p1.stepForward(20);
		
		Pubg p1 = new PubgV2();
		
		p1.turnRight();
		p1.stepBackward(20);
	}
}
