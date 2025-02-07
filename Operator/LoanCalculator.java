class LoanCalculator
{
	public static void main(String[] args)
	{
		float month = 20;
		
		int yr=month/12;
		int mn=month%12;
		System.out.print(yr+mn/10.0);
	}
}