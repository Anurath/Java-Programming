class EvenOdd3
{
	public static void main(String[] args)
	{
		int num =7624;

		int rem=num%10;

		String ans1= rem%2==0? "Even":"Odd";
		System.out.println(ans1)

		num=num/10;
		rem=num%10;
		String ans2= rem%2==0? "Even":"Odd";
		System.out.println(ans2)

		num=num/10;
		rem=num%10;
		String ans3 = rem%2==0?"Even":"Odd";
		System.out.println(ans3)

		num=num/10;
		rem=num%10;
		String ans4 = rem%2==0?"Even":"Odd";
		System.out.println(ans4)
	}
}