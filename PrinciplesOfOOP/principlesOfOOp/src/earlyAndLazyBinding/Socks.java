package earlyAndLazyBinding;

public class Socks {
	String name;
	double price;
	String type;
	double size;
	
	Socks(){};
	
	Socks(String name,double price,String type,double size)
	{
		this.name = name ;
		this.price = price;
		this.type = type;
		this.size = size;
	}
	
	public void displaySocks() {
		System.out.println("__________Socks Info___________");
		System.out.println(name);
		System.out.println(size);
		System.out.println(type);
		System.out.println(price);
	}
	
}
