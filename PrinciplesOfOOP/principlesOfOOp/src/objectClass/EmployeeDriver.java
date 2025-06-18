package objectClass;

public class EmployeeDriver {
	public static void main(String[] args)
	{
		Employee e1 = new Employee("Ram",23,40000,"TCS");
		Employee e2 = new Employee("Ram",23,40000,"TCS");
		
		System.out.println(e1.equals(e2));
	}
}
