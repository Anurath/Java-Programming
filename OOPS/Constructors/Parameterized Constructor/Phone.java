class Phone
{
	String name;
	String brand;
	double price;
	int ram;
	int rom;
	public Phone(String name,String brand,double price,int ram,int rom)
	{
		this.name=name;
		this.brand=brand;
		this.price=price;
		this.ram=ram;
		this.rom=rom;
	}
	public void displayPhone()
	{
		System.out.println(name);
		System.out.println(brand);
		System.out.println(price);
		System.out.println(ram);
		System.out.println(rom);
	}
}