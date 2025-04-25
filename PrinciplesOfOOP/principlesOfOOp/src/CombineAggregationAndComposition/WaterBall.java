package CombineAggregationAndComposition;

public class WaterBall {
	double price;
	double capacity;
	String color;
	String brand;
	
	WaterBall(){}
	
	WaterBall(double price,double capacity,String color,String brand)
	{
		this.brand = brand;
		this.capacity = capacity;
		this.price =price;
		this.color = color;
	}
	
	public void displayWaterBall()
	{
		System.out.println("-------------Water Bottle--------------");
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Capacity: "+capacity);
		System.out.println("Color: "+color);
	}
}
