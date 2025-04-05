class HeadOfState
{
	String name;
	String country;
	int age;
	int term;
	{
		System.out.println("Non static block starts");
	}
	public HeadOfState(String name,String country, int age, int term)
	{
		System.out.println("Constructor started.");
		this.country=country;
		this.name=name;
		this.age=age;
		this.term=term;
	}
	public void displayHeadOfState()
	{
		System.out.println("Country: "+country);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Term: "+term);
	}
}