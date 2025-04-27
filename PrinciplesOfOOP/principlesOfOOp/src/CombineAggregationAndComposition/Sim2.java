package CombineAggregationAndComposition;

public class Sim2 {
	private String serviceProvider;
	private String type;
	private long number;
	private String networkType;
	
	Sim2(){}
	
	Sim2(String serviceProvider,String type, long number, String networkType)
	{
		this.networkType = networkType;
		this.number = number;
		this.type = type;
		this.serviceProvider = serviceProvider;
	}
	public void displaySim() {
		System.out.println("Sim: [Service Provider: "+serviceProvider+" , Type: "+type+" , Number: "+number+" , Network Type: "+networkType+"]");
	}
}
