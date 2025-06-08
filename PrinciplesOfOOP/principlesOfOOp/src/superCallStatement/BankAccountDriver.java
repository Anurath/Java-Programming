package superCallStatement;

public class BankAccountDriver {
	public static void main(String[] args)
	{
		DematAccount d1 = new DematAccount("MGB",123412341234L,"Anurath","MGB002222","Pathrud",9876543210L,987654321012L,"Demat",34000,12000,"anurath12434",0.05);
		d1.displayDematAccount();
		System.out.println("------------------------");
		d1.displayBankAccount();
		System.out.println("---------------------------------------------");
		
		DebitAccount db1 = new DebitAccount("SBI",12312421312221L,"Ram","SBI042342","Pune",9876543210L,987654321012L,"Debit",23000,3.3);
		db1.displayDebitAccount();
		System.out.println("--------------------------");
		db1.displayBankAccount();
	}
}
