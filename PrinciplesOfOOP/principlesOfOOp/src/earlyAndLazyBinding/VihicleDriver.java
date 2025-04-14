package earlyAndLazyBinding;

public class VihicleDriver {
	public static void main(String[] args)
	{
		Vehicle v1 = new Vehicle("MG",2200000,10,"Gen");
		v1.insertMusicSystem("LG",25000,250,2);
		v1.m.displayMusicSystem();
	}
}
