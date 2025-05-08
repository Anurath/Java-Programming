package CombineAggregationAndComposition;

public class Country {
	String name;
	int independance;
	double area;
	long population;
	int states;
	long military;
	String idiology;
	PrimeMinister p;
	Country(){}
	
	Country(String name, int independance, double area, long population,int states, long military,String idiology)
	{
		this.name = name;
		this.idiology= idiology;
		this.independance = independance;
		this.area =area;
		this.population = population;
		this.states = states;
		this.military = military;
	}
	
	public void addPM(String name,int age , String party)
	{
		p = new PrimeMinister(name,age,party);
	}
	
	public  void displayCountry()
	{
		System.out.println("--------------Country Inforamation------------------");
		System.out.println("Name: "+name);
		System.out.println("Independance: "+independance);
		System.out.println("Area: "+area);
		System.out.println("Population: "+population);
		System.out.println("States: "+states);
		System.out.println("Military: "+military);
		System.out.println("Idiology: "+idiology);
	}
}
