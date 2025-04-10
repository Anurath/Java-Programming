package earlyAndLazyBinding;
import java.util.Scanner;
public class Bike {
	String brand;
	String name;
	double price;
	Engine e;
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name engine: ");
		String name = sc.next();
		System.out.println("Enter the power: ");
		int power = sc.nextInt();
		System.out.println("Enter the price of engine: ");
		double price = sc.nextDouble();
		System.out.println("Enter the type of engine: ");
		String type = sc.next();
		e = new Engine(name,power,price,type);
	}
	
	Bike(String brand , String name, double price)
	{
		this.brand = brand;
		this.name = name;
		this.price = price;
		System.out.println("Bike Created!");
	}
	
	public void displayBike() {
		System.out.println("Bike Specifications");
		System.out.println(brand);
		System.out.println(name);
		System.out.println(price);
	}
}
