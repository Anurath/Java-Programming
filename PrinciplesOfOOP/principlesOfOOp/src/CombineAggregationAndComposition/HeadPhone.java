package CombineAggregationAndComposition;

public class HeadPhone {
	private String brand;
	private String type;
	private double mic;
	private double price;
	
	HeadPhone(){}
	
	HeadPhone(String brand, String type,double mic,double price)
	{
		this.brand = brand;
		this.type = type;
		this.mic = mic;
		this.price = price;
	}
	
	public void displayHeadPhone()
	{
		System.out.println("HeadPhone: "+"Brand: "+brand+" , Type:"+type+" , Mic: "+mic+" , Price: "+price+"]");
	}
}
