package superCallStatement;

public class Mammals extends Animal {
	boolean fur;
	String bloodType;
	
	Mammals(){}
	
	Mammals(String name,int age,int weight,boolean fur,String bloodType)
	{
		super(name,age,weight);
		
		this.fur = fur;
		this.bloodType = bloodType;
	}
	
	public void displayMammals()
	{
		displayAnimal();
		 
		System.out.println("Fur: "+fur);
		System.out.println("Blood Type: "+bloodType);
	}
}
