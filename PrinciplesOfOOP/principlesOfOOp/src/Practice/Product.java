package Practice;

public class Product {
	
	private double price;
	
	void setPrice(double price)
	{
		if(price>0)
		{
			this.price=price;
		}
		else {
			System.out.println("Invalid Amount");
		}
	}
	
	double getPrice()
	{
		return price;
	}
}
