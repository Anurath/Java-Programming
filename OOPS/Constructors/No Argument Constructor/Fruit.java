class Fruit
{
	String name;
	int price;
	String region;
	{
		System.out.println("Object is initiated.");
	}
	Fruit()
	{
		System.out.println("From use defined constructor.");
	}
	public void displayFruit()
	{
		System.out.println("Fruit name: "+name);
		System.out.println("Price of fruit: "+price);
		System.out.println("Country: "+region);
	}
}