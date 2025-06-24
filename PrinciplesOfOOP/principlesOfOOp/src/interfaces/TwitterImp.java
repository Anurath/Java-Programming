package interfaces;

public class TwitterImp implements Twitter {
	public void post(String name,String ip)
	{
		System.out.println(ip);
		System.out.println("Posted "+name);
	}
	
	public void like(String name)
	{
		System.out.println("Liked!");
		System.out.println(name);
	}
	
	public void retwite(String name)
	{
		System.out.println("Retwited!");
		System.out.println(name);
	}
}
