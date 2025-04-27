package CombineAggregationAndComposition;

public class Battery2 {
	private String brand;
	private double price;
	private int hour;
	private double power;
	
	Battery2(){}
	
	Battery2(String brand,double price,int hour,double power)
	{	
		this.brand = brand;
		this.power = power;
		this.price = price;
		this.hour = hour;
	}
	
	public void displayBattery()
	{
		System.out.println("Battery: [ Brand: +"+brand+" , Price: "+price+" , Hour: "+hour+" , Power: "+power+"]");
	}
}
