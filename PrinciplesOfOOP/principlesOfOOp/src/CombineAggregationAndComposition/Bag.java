package CombineAggregationAndComposition;

public class Bag {
	String brand;
	double price;
	int pocket;
	Pen p ;
	Laptop l;
	WaterBall w;
	Book b;
	
	Bag(){}
	
	Bag(String brand, double price,int pocket)
	{
		this.brand = brand;
		this.price = price;
		this.pocket = pocket;
	}
	
	public void displayBag() {
		System.out.println("---------------------Bag---------------------");
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Pocket: "+pocket);
	}
	
	public void addPen(String brand,double price,boolean refill,String color)
	{
		p = new Pen(brand,price,refill,color);
	}
	public void addLaptop(String brand,String model, double price,int ram, int rom)
	{
		l = new Laptop(brand,model, price,ram, rom );
	}
	public void addWaterBall(double price,double capacity,String color,String brand)
	{
		w = new WaterBall(price,capacity,color, brand);
	}
	public void addBook(String name,String author,double price, int pages)
	{
		b = new Book(name,author,price,pages);
	}
}
