package CombineAggregationAndComposition;

public class Processor {
	String type;
	double clockSpeed;
	int ram;
	int rom;
	
	Processor(){}
	
	Processor(String type, double clockSpeed,int ram, int rom)
	{
		this.type = type;
		this.clockSpeed = clockSpeed;
		this.ram = ram;
		this.rom = rom;
	}
	
	public void displayProcessor()
	{
		System.out.println("-------------Processor Information---------------");
		System.out.println("Type: "+type);
		System.out.println("Clock Speed: "+clockSpeed);
		System.out.println("RAM: "+ram);
		System.out.println("ROM: "+rom);
	}
}
