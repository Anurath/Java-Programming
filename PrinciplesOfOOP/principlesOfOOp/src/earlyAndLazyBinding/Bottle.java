package earlyAndLazyBinding;

public class Bottle {
	String brand;
	double price;
	double height;
	double radius;
	String color;
	Cap c;
	Bottle(){}
	
	Bottle(String brand,double price,double height,double radius,String color,double capRadius,String capColor,String material)
	{
		System.out.println("Bottle");
		this.brand = brand;
		this.price  = price;
		this.height = height;
		this.radius = radius;
		this.color = color;
		
		c = new Cap(capRadius,capColor,material);
	}
	
	public void displayBottle()
	{
		System.out.println("--------------Bottle------------------");
		System.out.println(brand);
		System.out.println(price);
		System.out.println(height);
		System.out.println(radius);
		System.out.println(color);
	}
}
