package CombineAggregationAndComposition;

public class Mobile {
	String brand;
	String model;
	double price;
	String color;
	double camera;
	Processor p = new Processor("Snap Dragon",2.5,12,512);
	OperatingSystem os ;
	Battery battery;
	
	Mobile(){}
	
	Mobile(String brand,String model,double price,String color,double camera,OperatingSystem os)
	{
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.color = color;
		this.camera = camera;
		this.os = os;
		this.battery = new Battery(500,"Samsung","Lithium","17/04/2025","One year warranty",60);
	}
	public void displayMobile()
	{
		System.out.println("-----------------Mobile Information-------------------");
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Price: "+price);
		System.out.println("Color: "+color);
		System.out.println("Camera: "+camera);
	}
}
