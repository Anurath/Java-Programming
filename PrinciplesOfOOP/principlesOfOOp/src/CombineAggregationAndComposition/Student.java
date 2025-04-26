package CombineAggregationAndComposition;

public class Student {
	String name;
	String email;
	int sid;
	String education;
	int yop;
	
	Student(){}
	
	Student(String name, String email, int sid, String education,int yop)
	{
		this.name = name;
		this.email = email;
		this.sid = sid;
		this.education = education;
		this.yop = yop;
	}
	
	public void displayStudent()
	{
		System.out.println("Student [Name: "+name+", Email: "+email+", sid: "+sid+", Education"+education+", YOP: "+yop+"]");
	}
}
