class Bike
{
	String name;
	String brand;
	double price;
	{
		System.out.println("Non static block started");
		displayBike();
	}
	public Bike(String name, String brand,double price)
	{
		System.out.println("Counstrucor started.");
		this.name=name;
		this.brand=brand;
		this.price=price;
	}
	public void displayBike()
	{
		System.out.println(name);
		System.out.println(brand);
		System.out.println(price);
	}
}