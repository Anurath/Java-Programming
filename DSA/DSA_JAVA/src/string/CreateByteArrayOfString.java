package string;

import java.util.Arrays;

public class CreateByteArrayOfString {

	public static void main(String[] args)
	{
		String s = "abcdefghijklmnopqrstuvwxyz";
		byte[] ar = new byte[s.length()];
		
		for(int i=0;i<s.length();i++)
		{
			ar[i] = (byte)s.charAt(i);
		}
		
		System.out.println(Arrays.toString(ar));
	}
}
