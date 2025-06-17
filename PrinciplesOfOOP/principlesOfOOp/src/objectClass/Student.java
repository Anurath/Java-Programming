package objectClass;

public class Student {
	String name;
	String college;
	int rollNo;
	String degree;
	
	Student(){}
	
	Student(String name, String college,int rollNo,String degree)
	{
		this.name = name;
		this.college = college;
		this.rollNo = rollNo;
		this.degree = degree;
	}
	
	public String toString()
	{
		return "Name: "+name+", College: "+college+", Roll No.: "+rollNo+", Degree: "+degree;
	}
}
