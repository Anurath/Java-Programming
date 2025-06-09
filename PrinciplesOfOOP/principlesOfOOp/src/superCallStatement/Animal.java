package superCallStatement;

public class Animal {
	String name;
	int age;
	int weight;
	
	Animal(){}
	
	Animal(String name,int age,int weight)
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public void displayAnimal()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Weight: "+weight);
	}
}
