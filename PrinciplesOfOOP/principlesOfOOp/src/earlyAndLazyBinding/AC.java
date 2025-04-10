package earlyAndLazyBinding;

public class AC {
	String brand;
	double price;
	int warantee;
	Remote r;
	AC(){}
	AC(String brand,double price,int warantee,String remoteName,double remotePrice,int range)
	{
		r = new Remote(remoteName,remotePrice,range);
		this.brand = brand;
		this.price = price;
		this.warantee = warantee;
		System.out.println("AC created");
	}
	
	public void displayAC()
	{
		System.out.println("AC Specifications");
		System.out.println(brand);
		System.out.println(price);
		System.out.println(warantee);
	}
}
