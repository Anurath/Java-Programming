package objectClass;

public class Employee {
	String name ;
	int age;
	double salery;
	String company;
	
	Employee(){}
	
	Employee(String name,int age, double salery,String company)
	{
		this.name = name;
		this.age = age;
		this.salery = salery;
		this.company = company;
	}
	
	public boolean equals(Object o)
	{
		Employee e1 = (Employee)o;
		if(this.name==e1.name&&this.age == e1.age&&this.salery == e1.salery && this.company == e1.company)
		{
			return true;
		}
		else
			return false;
	}
}
