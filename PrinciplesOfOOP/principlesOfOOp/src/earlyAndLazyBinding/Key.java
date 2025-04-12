package earlyAndLazyBinding;

public class Key {
	double length;
	int teeths;
	double price;
	Key(){}
	
	Key(double length,int teeths,double price)
	{
		this.length = length;
		this.teeths = teeths;
		this.price = price;
	}
	
	public void displayKey()
	{
		System.out.println("----------------KEY INFO--------------------");
		System.out.println(length);
		System.out.println(teeths);
		System.out.println(price);
	}
}
