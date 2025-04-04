class Laptop
{
	String name;
	String brand;
	double price;
	int ram;
	int rom;
	{
		System.out.println("From Non Static Block");
	}
	Laptop()
	{
		System.out.println("From Constructor");
	}
	public void displayLaptop()
	{
		System.out.println("Name: "+name);
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+brand);
		System.out.println("RAM: "+ram);
		System.out.println("ROM: "+rom);
	}
}