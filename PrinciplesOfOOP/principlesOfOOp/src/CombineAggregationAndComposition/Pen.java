package CombineAggregationAndComposition;

public class Pen {
	String brand;
	double price;
	boolean refill;
	String color;
	
	Pen(){}
	
	Pen(String brand,double price,boolean refill,String color)
	{
		this.brand = brand;
		this.price = price;
		this.refill = refill;
		this.color = color;
	}
	
	public void displayPen() {
		System.out.println("-------------Pen------------------");
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Refiil: "+refill);
		System.out.println("Color: "+color);
	}
}
