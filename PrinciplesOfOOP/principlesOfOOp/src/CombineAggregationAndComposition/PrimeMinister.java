package CombineAggregationAndComposition;

public class PrimeMinister {
	String name;
	int age;
	String party;
	
	PrimeMinister(){}
	
	PrimeMinister(String name, int age, String party)
	{
		this.name= name;
		this.age= age;
		this.party = party;
	}
	public void displayPrimeMinister()
	{
		System.out.println("-------------Prime Minister Information-----------------");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Party: "+party);
	}
}
