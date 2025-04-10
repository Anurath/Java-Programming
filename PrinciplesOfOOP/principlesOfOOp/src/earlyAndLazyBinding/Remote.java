package earlyAndLazyBinding;

public class Remote {
	String name;
	double price;
	int range;
	Remote(){}
	
	Remote(String name,double price,int range)
	{
		this.name = name;
		this.price = price;
		this.range = range;
	}
	
	public void displayRemote()
	{
		System.out.println("Remote Specification");
		System.out.println(name);
		System.out.println(price);
		System.out.println(range);
	}
}
