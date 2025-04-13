package earlyAndLazyBinding;

public class Memory {
	int ram;
	double price;
	String brand;
	
	Memory(){}
	Memory(int ram , double price,String brand)
	{
		this.ram = ram;
		this.price = price;
		this.brand = brand;
	}
	
	public void displayMemory()
	{
		System.out.println("------------Memory Info-------------------");
		System.out.println("Brand: "+brand);
		System.out.println("RAM: "+ram);
		System.out.println("Price: "+price);
	}
}
