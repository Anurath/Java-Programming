package practiceArea;

public class Mango {

	double price;
	String type;
	String origin;
	
	public Mango(double price,String type,String origin)
	{
		this.price = price;
		this.type = type;
		this.origin = origin;
	}
	
	public Mango displayType() {
		System.out.println(type);
		return this;
	}
	
	public Mango displayPrice()
	{
		System.out.println(price);
		return this;
	}
	
	public Mango displayOrigin()
	{
		System.out.println(origin);
		return this;
	}
}
