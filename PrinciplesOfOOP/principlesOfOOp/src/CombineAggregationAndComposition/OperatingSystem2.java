package CombineAggregationAndComposition;

public class OperatingSystem2 {
	private String name;
	private String version;
	private double memoryConsume;
	private String releaseDate;
	
	OperatingSystem2() {}
	
	OperatingSystem2(String name,String version,double memoryConsume,String releaseDate)
	{
		this.memoryConsume = memoryConsume;
		this.name = name;
		this.version = version;
		this.releaseDate =releaseDate;
	}
	
	public void displayOperatingSystem()
	{
		System.out.println("Operating System: [Name: "+name+" , Version"+version+" , Memory Consume: "+memoryConsume+" , Release Date: "+releaseDate+"]");
	}
}
