package earlyAndLazyBinding;
import java.util.Scanner;
public class Mobile1 {
	String brand;
	String name;
	double price;
	int simSlot;
	Battery b1;
	
	Mobile1(){}
	Mobile1(String brand,String name,double price,int simSlot)
	{
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.simSlot = simSlot;
	}
	public void displayMobile()
	{
		System.out.println("------------Mobile Info--------------");
		System.out.println("Brand: "+brand);
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
		System.out.println("Sim Slot: "+simSlot);
	}
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Battery Id: ");
		String batteryId = sc.next();
		System.out.print("Enter the price: ");
		double price = sc.nextDouble();
		System.out.print("Enter the Battery Capacity: ");
		int capacity  = sc.nextInt();
		
		b1 = new Battery(batteryId,price,capacity);
		sc.close();
	}
}
