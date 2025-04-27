package CombineAggregationAndComposition;

public class Processor2 {
	private String type;
	private double clockspeed;
	private String network;
	private int ram;
	private int rom;
	private OperatingSystem2 os ;
	
	Processor2() {}
	
	Processor2(String type, double clockSpeed, String network,int ram, int rom )
	{
		this.clockspeed =clockSpeed;
		this.network = network;
		this.ram = ram ;
		this.rom =  rom ;
		this.type =type;
		
		this.os = new OperatingSystem2("Anroid","15",8,"19-04-2025");
	}
	
	public OperatingSystem2 getOS()
	{
		return os;
	}
	
	public void displayProcessor()
	{
		System.out.println("Processor: [Type: "+type+" , Clock Speed: "+clockspeed+" , Network: "+network+" , RAM: "+ram+" , ROM: "+rom+"]");
	}
}
