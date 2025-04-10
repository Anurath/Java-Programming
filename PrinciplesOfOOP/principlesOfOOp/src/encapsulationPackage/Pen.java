package encapsulationPackage;

public class Pen {
	String brand;
	double price;
	String type;
	Refill r1 = new Refill();
	
	Pen(String brand,double price , String type)
	{
		this.brand = brand;
		this.price = price;
		this.type = type;
	}
	
	public void displayPen()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Price of Pen: "+price);
		System.out.println("Type: "+type);
	}
}
