package superCallStatement;

public class Dog extends Mammals {
	String breed;
	String type;
	
	Dog(){}
	
	Dog(String name,int age,int weight,boolean fur,String bloodType,String breed,String type)
	{
		super(name,age,weight,fur,bloodType);
		
		this.breed = breed;
		this.type = type;
	}
	
	public void displayDog()
	{
		displayMammals();
		
		System.out.println("Breed: "+breed);
		System.out.println("Type: "+type);
	}
}
