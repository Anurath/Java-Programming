package accessModifiers;

public class ClassPrivate {

	private int age =10;
	private String name="Ram";
	
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int newAge)
	{
		age = newAge;
		System.out.println("Age is been changed!");
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		name = newName;
		System.out.println("Name is changed!");
	}
}

