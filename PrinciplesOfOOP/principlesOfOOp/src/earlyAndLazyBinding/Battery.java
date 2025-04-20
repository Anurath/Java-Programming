package earlyAndLazyBinding;

public class Battery {
	String batteryId;
	double price;
	int capacity;
	
	Battery(){}
	
	Battery(String batteryId,double price,int capacity)
	{
		this.batteryId = batteryId;
		this.capacity = capacity;
		this.price = price;
	}
	
	public void displayBattery()
	{
		System.out.println("-------------Battery Info---------");
		System.out.println("Id: "+batteryId);
		System.out.println("Price: "+price);
		System.out.println("Capacity: "+capacity);
	}
	
}
