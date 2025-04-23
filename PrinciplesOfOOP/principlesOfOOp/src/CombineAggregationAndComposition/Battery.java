package CombineAggregationAndComposition;

public class Battery {
	int capacity;
	String brand;
	String type;
	String manDate;
	String warranty;
	double power;
	Battery(){}
	
	Battery(int capacity,String brand,String type,String manDate,String warranty,double power)
	{
		this.capacity = capacity;
		this.brand = brand;
		this.type = type;
		this.manDate = manDate;
		this.warranty = warranty;
		this.power = power;
	}
	
	public void displayBattery()
	{
		System.out.println("-----------------Battery Information-------------");
		System.out.println("Capacity: "+capacity);
		System.out.println("Brand: "+brand);
		System.out.println("Type: "+type);
		System.out.println("Manifactur Date: "+manDate);
		System.out.println("Warranty: "+warranty);
		System.out.println("Power: "+power);
	}
}
