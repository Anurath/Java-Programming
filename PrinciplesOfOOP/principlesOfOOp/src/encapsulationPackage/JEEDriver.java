package encapsulationPackage;

public class JEEDriver {
	public static void main(String[] args)
	{
		JEE j1 = new JEE("Anurath","anurathwaghmode2018@gmail.com","Anurath@123",9373818619L,40.4,700000);
		j1.setEmail("Anurath@123", "waghmodeanurath@gmail.com");
		System.out.println(j1.getEmail());
	}
}
