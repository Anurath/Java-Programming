package array;

public class Student {
	String name;
	String clg;
	int age;
	int rollNo;
	
	Student(){}
	
	Student(String name,String clg,int age,int rollNo)
	{
		this.name = name;
		this.clg = clg;
		this.age = age;
		this.rollNo = rollNo;
	}
	
	public String toString()
	{
		return "[Name: "+name+", College: "+clg+", Age: "+age+", Roll No.: "+rollNo+"]";
	}
}
