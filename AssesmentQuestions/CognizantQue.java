import java.util.HashSet;
import java.util.Set;

class CognizantQue
{
	public static void main(String[] args)
	{
		char[] arr= {'a','b','i','a','b','i','a','b','i','a','b','i'};
		Set<Character> charSet = new HashSet<>(Arrays.asList(arr));
		System.out.println(charSet);

	}
}