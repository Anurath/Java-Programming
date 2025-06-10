package sealedClass;

public sealed class Parent permits child1,child2 {
	String name = "Raju";
	int age = 50;
	
	public void displayParent()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
