package encapsulationPackage;

public class ATMDriver {
	public static void main(String[] args) {
		ATM a1 = new ATM("Anurath",2345,1234, 9876543210L,10000);
		a1.debit(2345, 1234,500);
		a1.setPin(2345,1234,1111);
		a1.debit(2345,1111,1000);
	}
}
