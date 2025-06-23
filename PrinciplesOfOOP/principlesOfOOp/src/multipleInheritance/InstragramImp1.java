package multipleInheritance;

public class InstragramImp1 implements Instagram{
	
	String name;
	String pass;
	
	InstragramImp1(){}
	
	InstragramImp1(String name,String pass)
	{
		this.name = name;
		this.pass = pass;
	}
	public void post(String name,String ip)
	{
		System.out.println(ip);
		System.out.println(name);
	}
	
	public void like(String name)
	{
		System.out.println("Liked!");
		System.out.println(name);
	}
	
	public void comment(String cmt)
	{
		System.out.println(cmt);
	}
	
	public void dm(String msg) {
		System.out.println(msg);
	}
}
