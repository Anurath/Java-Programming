package interfaces;

public class TwitterDriver {
	public static void main(String[] args)
	{
		Twitter t1 = new TwitterImp();
		
		t1.post("Ram","Today USA's B2 bomber attacked on Iran at 4:30");
		
		t1.like("Rani");
		
		t1.retwite();
	}
}
