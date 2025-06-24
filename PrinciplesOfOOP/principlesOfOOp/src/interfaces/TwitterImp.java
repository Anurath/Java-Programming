package interfaces;

public class TwitterImp implements Twitter {
	public void post(String name,String ip)
	{
		System.out.println(ip);
		System.out.println("Posted "+name);
	}
	
	public void like()
	{
		System.out.println("Liked!");
	}
}
