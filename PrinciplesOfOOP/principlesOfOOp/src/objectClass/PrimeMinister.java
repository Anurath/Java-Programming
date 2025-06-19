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
	
	public String toString()
	{
		return "Name: "+name+",Country: "+country+" ,Age: "+age+" ,Tenure: "+tenure+" ,Party: "+party;
	}
	
	public boolean equals(Object o)
	{
		PrimeMinister p1 = (PrimeMinister)o;
		
		if(this.name == p1.name && this.age == p1.age && this.country == p1.country && this.tenure == p1.tenure)
		{
			return true;
		}
		else
			return false;
	}
	
	public int hashCode()
	{
		return age+tenure+name.hashCode()+country.hashCode()+party.hashCode();
	}
}
