package string;

import java.util.Arrays;

public class CreateCharArraayOfString {

	public static void main(String[] args)
	{
		String s = "abcdefghijklmnopqrstuvwxyz";
		char[] ch = new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			ch[i] = (char)s.charAt(i);
		}
		System.out.println(Arrays.toString(ch));
	}
}
