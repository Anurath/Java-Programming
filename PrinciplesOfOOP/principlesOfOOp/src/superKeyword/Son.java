package superKeyword;

public class Son extends Father {
	String name = "Kush";
	
	
	public void displayName()
	{
		super.displayName();
		System.out.println("Son Name: "+name);
		System.out.println("Father Name: "+super.name);
	}
}
