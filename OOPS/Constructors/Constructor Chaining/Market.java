class Market
{
	int tomato;
	int potato;
	int banana;
	int mango;
	int sweets;
	
	Market(){}

	Market(int tomato,int potato,int banana)
	{
		this.tomato=tomato;
		this.potato=potato;
		this.banana=banana;
		System.out.println("From Constructor 1");
	}

	Market(int tomato, int potato, int banana,int mango)
	{
		this(tomato,potato,banana);

		this.mango=mango;
		System.out.println("From Constructor 2");
	}
	Market(int tomato,int potato,int banana,int mango, int sweets)
	{
		this(tomato,potato,banana,mango);

		this.sweets=sweets;
		System.out.println("From Constructor 3");
	}
	public void displayItems()
	{
		System.out.println("Tomato: "+tomato+"kg");
		System.out.println("Potato: "+potato+"kg");
		System.out.println("Banana: "+banana+"kg");
		System.out.println("Mango: "+mango+"kg");
		System.out.println("Sweets: "+sweets+"kg");
	}
}