package encapsulationPackage;

public class BankDriver {
	public static void main(String[] args) {
		Bank b1 = new Bank("Anurath","MGB","MGB00023", 0,123456,1234);
		b1.credit(123456,1234,600);
		b1.debit(123456,1234,150);
		System.out.println(b1.getUsername());
		System.out.println(b1.getBankName());
	}
}
