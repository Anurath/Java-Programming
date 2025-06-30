package interfaces;

public class NumbersDriver {
	public static void main(String[] args)
	{
		Numbers n1 = new NumberImp();
		
		System.out.println(n1.isPrime(12));
		System.out.println(n1.prevPrimeNumber(34));
		System.out.println(n1.nextPrime(45));
		System.out.println(n1.fact(12));
	}
}
