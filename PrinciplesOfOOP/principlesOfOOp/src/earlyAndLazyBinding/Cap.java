package earlyAndLazyBinding;

public class Cap {
	double radius;
	String color;
	String material;
	
	Cap(){}
	
	Cap(double radius,String color,String material)
	{
		this.radius = radius;
		this.color = color;
		this.material = material;
		System.out.println("Cap");
	}
	
	public void displayCap()
	{
		System.out.println("----------Cap Info------------");
		System.out.println(radius);
		System.out.println(color);
		System.out.println(material);
	}
}
