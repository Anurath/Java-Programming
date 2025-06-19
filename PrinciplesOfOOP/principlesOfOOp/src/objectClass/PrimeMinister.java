package objectClass;

public class PrimeMinister {
	String name;
	String country;
	int age;
	String party;
	int tenure;
	
	PrimeMinister(){}
	
	PrimeMinister(String name, String  country, int age,int tenure,String party)
	{
		this.name = name;
		this.age = age;
		this.country = country;
		this.party= party;
		this.tenure = tenure;
	}
	
//	public String toString()
//	{
//		return "Name: "+name+",Country: "+country+" ,Age: "+age+" ,Tenure: "+tenure+" ,Party: "+party;
//	}
}
