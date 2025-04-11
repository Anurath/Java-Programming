package earlyAndLazyBinding;
import java.util.Scanner;
public class Car {
	String name;
	double price;
	Tyre t;
	Car(){}
	
	Car(String name,double price)
	{
		this.name = name;
		this.price = price;
	}
	
	public void insertTyre()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of tyre: ");
		String name = sc.next();
		System.out.print("Enter the price of the tyre: ");
		double price = sc.nextDouble();
		System.out.print("Enter the type: ");
		String type = sc.next();
		t = new Tyre(name,type,price);
		sc.close();
	}
	public void displayCar()
	{
		System.out.println(name);
		System.out.println(price);
	}
}
