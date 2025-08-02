package string;

public class StringLengthWithoutLenghtMethod {

	public static void main(String[] args) {
		String s = "asdfgh";
		int i=0;
		while(true)
		{
			try
			{
				s.charAt(i);
			}
			catch(StringIndexOutOfBoundsException e)
			{
				break;
			}
			i++;
		}
		System.out.println(i);
	}
}
