package earlyAndLazyBinding;

public class IPod {
	String brand;
	double price;
	int battery;
	Memory m;
	IPod(){}
	
	IPod(String brand,double price,int battery)
	{
		this.brand = brand;
		this.battery = battery;
		this.price = price;
	}
	
	public void displayIPod()
	{
		System.out.println("---------------IPod Info----------------");
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Battery: "+battery);
	}
	
	public void insertMemory(int ram, double price,String brand)
	{
		m  = new Memory(ram,price,brand);
		System.out.println("Memory Object Created.");
	}
}
