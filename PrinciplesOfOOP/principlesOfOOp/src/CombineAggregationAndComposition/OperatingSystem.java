package CombineAggregationAndComposition;

public class OperatingSystem {
	String version;
	String name;
	double memory;
	String releaseDate;
	
	OperatingSystem(){}
	
	OperatingSystem(String version, String name, double memory, String releaseDate)
	{
		this.version = version;
		this.memory = memory;
		this.releaseDate = releaseDate;
		this.name = name;
	}
	
	public void displayOperatingSystem()
	{
		System.out.println("------------Operating System-------------");
		System.out.println("Version: "+version);
		System.out.println("Name: "+name);
		System.out.println("Memory: "+memory);
		System.out.println("Release Date: "+releaseDate);
	}
}
