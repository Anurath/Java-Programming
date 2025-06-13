package sealedClass;

public sealed class Father permits Son {
	public void displayFather()
	{
		System.out.println("From father class");
	}
}
