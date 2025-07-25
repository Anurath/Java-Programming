package practiceArea;

public class RecoveryBinDriver {

	public static void main(String[] args)
	{
		RecoveryBin r1 = new RecoveryBin();
		
		r1.addName("Bharat");
		r1.addName("Love");
		r1.addName("Kush");
		r1.addName("Bharat");
		
//		r1.showDB();
//		
//		r1.rollBack(1);
//		
//		r1.showDB();
		
		r1.removeName("Anurath");
		
		r1.showDB();
		
		r1.rollBack(1);
		
		r1.showDB();
	}
}
