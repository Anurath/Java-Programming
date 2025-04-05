class Village
{
	String name;
	String sarpanch;
	int pop;
	{
		System.out.println("From non-static block");
		displayVillage();
	}
	public Village()
	{
		System.out.println("From No Argument Constructor");
	}
	public Village(String name,String sarpanch,int pop)
	{
		System.out.println("Constructor starts");
		this.name=name;
		this.sarpanch=sarpanch;
		this.pop=pop;
	}
	public void displayVillage()
	{
		System.out.println(name);
		System.out.println(sarpanch);
		System.out.println(pop);
	}
}