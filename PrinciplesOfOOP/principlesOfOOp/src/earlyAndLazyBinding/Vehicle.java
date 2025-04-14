package earlyAndLazyBinding;

public class Vehicle {
	String brand;
	double price;
	double mileage;
	String type;
	
	Vehicle(){}
	
	Vehicle(String brand,double price,double mileage,String type)
	{
		this.brand = brand;
		this.price = price;
		this.mileage = mileage;
		this.type = type;
	}
	
	public void displayVehicle()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Mileage: "+mileage);
		System.out.println("Type: "+type);
	}
}
