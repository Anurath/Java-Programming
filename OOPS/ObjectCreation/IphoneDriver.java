class IphoneDriver
{
	public static void main(String[] args)
	{
		Iphone ip=new Iphone();
		ip.brand="Iphone";
		ip.model = "Iphone 16";
		ip.ram = 12;
		ip.rom=256;
		ip.price=150000;

		Iphone ip1=new Iphone();
		ip1.brand="Iphone";
		ip1.model="Iphone 14 pro";
		ip1.ram=16;
		ip1.rom=256;
		ip1.price=140000;

		Iphone ip2=new Iphone();
		ip2.brand="Iphone";
		ip2.model="Iphone 13 pro";
		ip2.ram=12;
		ip2.rom=256;
		ip2.price=130000;

		System.out.println("Brand :"+ip.brand);
		System.out.println("Model :"+ip.model);
		System.out.println("RAM :"+ip.ram);
		System.out.println("ROM :"+ip.rom);
		System.out.println("Price :"+ip.price);
		System.out.println("___________________________");

		System.out.println("Brand :"+ip1.brand);
		System.out.println("Model :"+ip1.model);
		System.out.println("RAM :"+ip1.ram);
		System.out.println("ROM :"+ip1.rom);
		System.out.println("Price :"+ip1.price);
		System.out.println("___________________________");

		System.out.println("Brand :"+ip2.brand);
		System.out.println("Model :"+ip2.model);
		System.out.println("RAM :"+ip2.ram);
		System.out.println("ROM :"+ip2.rom);
		System.out.println("Price :"+ip2.price);
		System.out.println("___________________________");
	}
}