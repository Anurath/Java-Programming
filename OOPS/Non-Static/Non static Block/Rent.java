class Rent
{
	String country="USA";
	int rent;
	{
		System.out.println("Object Initiated.");
		if(this.country.charAt(0)=='I')
		{
			rent=1000;
		}
		else
		{
			rent=2000;
		}
	}
	public Rent displayCountry()
	{
		System.out.println("Country Name: "+country);
		return this;
	}
	public void displayRent()
	{
		System.out.println("Rent: "+rent);
	}
}