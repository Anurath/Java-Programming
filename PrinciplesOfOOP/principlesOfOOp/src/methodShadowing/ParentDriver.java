package methodShadowing;

public class ParentDriver {
	public static void main(String[] args)
	{
		Parent p1 = new Child();
		
		p1.name();
	}
}
