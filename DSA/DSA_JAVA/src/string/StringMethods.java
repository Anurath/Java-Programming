package string;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = "pneumonoultramicroscopicsilicovolcanoconiosis";
		String s2 = "Anurath";
		
		System.out.println(s1.charAt(0));
		
		System.out.println(s1.codePointAt(12));
		
		System.out.println(s1.codePointBefore(3));
		
		System.out.println(s1.codePointCount(2,5));
		
		System.out.println("Sham".compareTo("Ram"));
		
		System.out.println("Anurath".compareToIgnoreCase("anurath"));
		
		System.out.println("Hi".concat("Hello"));
		
		System.out.println(s1.contains("volcano"));
		
		System.out.println("hi".contentEquals("hi"));
		
		System.out.println(s1.endsWith("sis"));
		
		System.out.println(s2.endsWith("th"));
		
		byte[] ar = s2.getBytes();
		
		System.out.println(Arrays.toString(ar));
		
		byte[] ar2 = s1.getBytes();
		
		System.out.println(Arrays.toString(ar2));
		
		System.out.println(s2.indent(20));  //Intend add extra space at left side
		
		System.out.println(s2.indexOf("t"));
		
		System.out.println(s2.indexOf('t',2));
		
		System.out.println(s2.indexOf("qh"));
		
		System.out.println("".isBlank());
		
		System.out.println("   ".isEmpty());
		System.out.println("".isEmpty());
		
		System.out.println(s2.lastIndexOf('a'));
		
		System.out.println(s2.length());
		
		System.out.println("ABC".repeat(10));
		
		System.out.println(s2.replace('a', 'e'));
		
		System.out.println(s2.replace("th", "bh"));
		
		String s3 = "I Love Bharat";
		
		String[] strAr = s3.split(" ");
		
		System.out.println(Arrays.toString(strAr));
		
		System.out.println("    Anurath    ".strip());
		
		System.out.println(s2.substring(4));
		
		System.out.println(s2.substring(2,4));
		
	}
}
