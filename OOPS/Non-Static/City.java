class City
{
	String name;
	String origin;
	long population;
	long GDP;
	public void displayCity()
	{
		System.out.println("Name: "+name);
		System.out.println("Origin: "+origin);
		System.out.println("Population: "+population);
		System.out.println("GDP"+GDP);
	}
	public City PCI()
	{
		System.out.println(GDP/population);
		return this;
	}
}