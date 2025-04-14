package earlyAndLazyBinding;

public class MusicSystem {
	String brand;
	double price;
	int maxSound;
	int warantee;
	
	MusicSystem(){}
	MusicSystem(String brand, double price,int maxSound,int warantee)
	{
		this.brand = brand;
		this.price = price;
		this.maxSound = maxSound;
		this.warantee = warantee;
	}
	
	public void displayMusicSystem()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Max Sound: "+maxSound);
		System.out.println("Warantee: "+warantee);
	}
}
