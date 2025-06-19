package objectClass;

public class PrimeMinisterDriver {
	public static void main(String[] args)
	{
		PrimeMinister p1 = new PrimeMinister("Narendra Modi","India",68,11,"NDA");
		PrimeMinister p2 = new PrimeMinister("Narendra Modi","India",68,11,"NDA");

		System.out.println(p1.toString());
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

	}
}
