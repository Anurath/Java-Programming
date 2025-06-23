package multipleInheritance;

public class InstragramImp1 {
	public void post(String name,String ip)
	{
		System.out.println(ip);
		System.out.println(name);
	}
	
	public void like()
	{
		System.out.println("Liked!");
	}
	
	public void comment(String cmt)
	{
		System.out.println(cmt);
	}
	
	public void dm(String msg) {
		System.out.println(msg);
	}
}
