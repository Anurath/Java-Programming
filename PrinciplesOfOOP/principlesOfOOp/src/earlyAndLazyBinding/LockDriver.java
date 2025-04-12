package earlyAndLazyBinding;

public class LockDriver {
	public static void main(String[] args)
	{
		Lock l1 = new Lock("LG",1200,"Medium");
		l1.displayLock();
		l1.k.displayKey();
	}
}
