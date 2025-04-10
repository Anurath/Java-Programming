package earlyAndLazyBinding;

public class Engine {
	String name;
	int power;
	double price;
	String type;
	
	Engine(){}
	
	Engine(String name,int power,double price,String type)
	{
		this.name=name;
		this.power = power;
		this.price = price;
		this.type = type;
	}
	
	public void displayEngine()
	{
		System.out.println("Engine Specifiactions");
		System.out.println(name);
		System.out.println(power);
		System.out.println(price);
		System.out.println(type);
	}
}
