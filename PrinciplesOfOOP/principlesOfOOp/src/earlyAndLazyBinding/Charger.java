package earlyAndLazyBinding;

public class Charger {
	String name;
	String type;
	double price;
	
	Charger(){}
	
	Charger(String name, String type,double price)
	{
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	public void displayCharger()
	{
		System.out.println(name);
		System.out.println(type);
		System.out.println(price);
	}
}
