package earlyAndLazyBinding;
import java.util.Scanner;
public class Shoes {
	String name;
	String type;
	double price;
	double size;
	Socks s;
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of socks: ");
		String name=sc.next();
		System.out.print("Enter the price of socks: ");
		double price = sc.nextDouble();
		System.out.print("Enter the size of socks: ");
		double size = sc.nextDouble();
		System.out.print("Enter the type of socks: ");
		String type = sc.next();
		s = new Socks(name,price,type,size);
		sc.close();
	}
	Shoes(){}
	
	Shoes(String name,String type,double price,double size)
	{
		this.name = name;
		this.type = type;
		this.price = price;
		this.size = size;
	}
	
	public void displayShoes()
	{
		System.out.println("_________Shoes Info_____________");
		System.out.println(name);
		System.out.println(type);
		System.out.println(size);
		System.out.println(price);
	}
}
