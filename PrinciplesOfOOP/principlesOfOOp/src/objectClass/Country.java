package objectClass;

public class Country {
	String name;
	String capital;
	String hos;
	int states;
	
	Country(){}
	
	Country(String name,String capital,String hos,int states)
	{
		this.name = name;
		this.capital = capital;
		this.hos = hos;
		this.states = states;
	}
	
	public String toString()
	{
		return "Name: "+name+", Capital: "+capital+", Head of State: "+hos+", States: "+28;
	}
}
