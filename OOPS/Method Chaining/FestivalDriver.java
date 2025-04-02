class FestivalDriver
{
	public static void main(String[] args)
	{
		Festival f1 = new Festival();
		f1.name="Bail Pola";
		f1.month=9;
		f1.festFood="Puran Poli";
		f1.region="Maharastra , Karnataka";
		f1.displayName().displayMonth().displayFood().displayRegion();
	}
}