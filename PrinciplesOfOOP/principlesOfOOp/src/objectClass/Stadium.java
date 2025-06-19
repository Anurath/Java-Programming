package objectClass;

public class Stadium {
	String name;
	int capacity;
	String game;
	int year;
	String homeTeam;
	
	Stadium(){}
	
	Stadium(String name,int capacity,String game,int year,String homeTeam)
	{
		this.name = name;
		this.capacity = capacity;
		this.game = game;
		this.year = year;
		this.homeTeam = homeTeam;
	}
	
//	public String toString()
//	{
//		return "Name: "+" ,Capacity: "+capacity+" ,Game: "+game+",Year: "+year+" ,Home Team: "+homeTeam;
//	}
	
	public int hashCode()
	{
		return capacity+year;
	}
}
