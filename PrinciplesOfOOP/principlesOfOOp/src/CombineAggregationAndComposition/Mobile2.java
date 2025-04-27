package CombineAggregationAndComposition;

public class Mobile2 {
	private String brand;
	private String model;
	private double price;
	private String color;
	Battery2 b = new Battery2("Log",1200,12,5200);
	Processor2 processor;
	
	Sim2 sim;
	HeadPhone headPhone;
	Charger2 charger;
	
	Mobile2(){}
	Mobile2(String brand, String model,double price,String color,Processor2 processor)
	{
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.color = color;
		this.processor = processor;
	}
	
	// Getter's
	
	public Processor2 getProcessor()
	{
		return processor;
	}
	
	public Sim2 getSim()
	{
		return sim;
	}
	
	public Charger2 getCharger() {
		return charger;
	}
	
	public HeadPhone getHeadPhone()
	{
		return headPhone;
	}
	
	
	//Setter's
	
	public void insertSim()
	{
		sim = new Sim2("Jio","Postpaid",987654321,"5G");
	}
	
	public void addHeadPhone()
	{
		headPhone = new HeadPhone("Boat","Gen",12,1200);
	}
	
	public void insertCharger() {
		charger = new Charger2("C","Redmi",63);
	}
	
	
	// Display Mobile 
	
	public void displayMobile()
	{
		System.out.println("Mobile: [Brand: "+brand+" , Model: "+model+" ,Price: "+price+" , Color: "+color+"]");
	}
	
}
