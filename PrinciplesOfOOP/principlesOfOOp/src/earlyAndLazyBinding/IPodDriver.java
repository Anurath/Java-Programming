package earlyAndLazyBinding;

public class IPodDriver {
	public static void main(String[] args)
	{
		IPod ip = new IPod("Local",340,2000);
		ip.insertMemory(32,220,"LG");
		ip.m.displayMemory();
	}
}
