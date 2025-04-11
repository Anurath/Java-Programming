package earlyAndLazyBinding;

public class Tyre {
	String name;
	String type;
	double price;
	
	Tyre(){}
	
	Tyre(String name, String type, double price)
	{
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	public void displayType()
	{
		System.out.println("_________Tyre Info______________");
		System.out.println(name);
		System.out.println(type);
		System.out.println(price);
	}
}
