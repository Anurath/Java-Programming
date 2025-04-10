package encapsulationPackage;

public class Bike {
	String brand;
	String name;
	double price;
	Engine e1 = new Engine();
	
	Bike(String brand,String name,double price)
	{
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	public void displayBike()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Name "+name);
		System.out.println("Price: "+price);
	}
}
