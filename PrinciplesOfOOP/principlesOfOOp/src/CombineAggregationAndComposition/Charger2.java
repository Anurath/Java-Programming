package CombineAggregationAndComposition;

public class Charger2 {
	private String type;
	private String brand;
	private double power;
	
	Charger2(){}
	
	Charger2(String type,String brand,double power)
	{
		this.type = type;
		this.brand = brand;
		this.power = power;
	}
	
	public void displayCharger()
	{
		System.out.println("Charger: [Brand: "+brand+" , type: "+type+" , power: "+power+"]");
	}
}
