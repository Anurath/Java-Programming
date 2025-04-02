class FlagDriver
{
	public static void main(String[] args)
	{
		Flag f1= new Flag();
		f1.nameOfCountry="India";
		f1.height=2;
		f1.width=3;
		f1.color="Orange,White,Green and Blue";
		f1.displayFlag();
		System.out.println(f1);
		Flag f2= new Flag();
		f2.nameOfCountry="Nepal";
		f2.height=3;
		f2.width=3;
		f2.color="Red White";
		f2.displayFlag();
		System.out.println(f1.nameOfCountry);
		System.out.println(f2.nameOfCountry);
		System.out.println(Flag.nameOfCountry);

	}
}
 