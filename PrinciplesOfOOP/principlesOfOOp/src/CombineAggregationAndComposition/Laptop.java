package CombineAggregationAndComposition;

public class Laptop {
	String brand;
	String model;
	double price;
	int ram;
	int rom;
	
	Laptop(){}
	
	Laptop(String brand,String model, double price,int ram, int rom)
	{
		this.brand =brand;
		this.model = model;
		this.price = price;
		this.ram = ram;
		this.rom = rom;
	}
	public void displayLaptop() {
		System.out.println("------------Laptop--------------");
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Price: "+price);
		System.out.println("RAM: "+ram);
		System.out.println("ROM "+rom);
	}
}
