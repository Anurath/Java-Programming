package earlyAndLazyBinding;
import java.util.Scanner;

public class Lock {
	String brand;
	double price;
	String size;
	Key k;
	{
		Scanner  sc  = new Scanner(System.in);
		System.out.print("Enter the Length of key: ");
		double length = sc.nextDouble();
		System.out.print("Enter the Price of key: ");
		double price = sc.nextDouble();
		System.out.print("Enter the teeth count: ");
		int teeths = sc.nextInt();
		
		k = new Key(length,teeths,price);
	}
	
	Lock(){}
	
	Lock(String brand , double price , String size)
	{
		this.brand = brand;
		this.price = price;
		this.size = size;
	}
	
	public void displayLock()
	{
		System.out.println("-----------------LOCK INFO----------------");
		System.out.println(brand);
		System.out.println(price);
		System.out.println(size);
	}
}
