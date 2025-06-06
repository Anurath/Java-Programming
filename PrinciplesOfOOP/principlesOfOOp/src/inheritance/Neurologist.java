package inheritance;

public class Neurologist extends Doctor{
	String spl;
	String organ;
	Cardiologist(String name,String hospital,String degree,int exp,String spl,String organ)
	{
		this.name = name;
		this.hospital = hospital;
		this.degree = degree;
		this.exp =exp;
		
		this.spl = spl;
		this.organ = organ;
	}
	
	public void displayCardiologist()
	{
		displayDoctor();
		
		System.out.println("Speceilizatoin: "+spl);
		System.out.println("Organ: "+organ);
	}
}
