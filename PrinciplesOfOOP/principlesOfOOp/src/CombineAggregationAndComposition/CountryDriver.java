package CombineAggregationAndComposition;

public class CountryDriver {
	public static void main(String[] args)
	{
		Country c1 = new Country("India",1947,329898324,1500000000,28,2100000,"Democracy");
		c1.addPM("Narendra Modi",70,"BJP");
		c1.p.displayPrimeMinister();
	}
}
