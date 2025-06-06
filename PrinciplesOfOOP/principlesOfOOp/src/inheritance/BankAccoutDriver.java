package inheritance;

public class BankAccoutDriver {
	public static void main(String[] args)
	{
		DematAccount d1 = new DematAccount("MGB","MGB0000243","Pathrud",1234567,9876543210l,123456789098l,"Anurath","Demat","D12131223",12000,120000,0.05);
		d1.displayBankAccount();
		d1.displayDematAccount();
		
		DebitAccount deb1 = new DebitAccount("MGB","MGB1232","Pathrud",234973498,9887649239l,893297823498l,"Anurath","Debit",32300,1.5);
		deb1.displayBankAccount();
		deb1.displayDebitAccount();
	}
}
