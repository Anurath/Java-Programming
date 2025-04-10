package encapsulationPackage;

public class Engine {
	String type;
	String name;
	double power;
	double price;
	
	Engine(){};
	
	public void displayEngine()
	{
		System.out.println("Type: "+type);
		System.out.println("Name: "+name);
		System.out.println("Power: "+power);
		System.out.println("Price: "+price);
	}
}
