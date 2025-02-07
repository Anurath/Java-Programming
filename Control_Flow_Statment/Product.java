class Product
{
	public static void main(String[] args)
	{
		int num =1234;
		int product = 1;

		int rem = num%10;
		product = product*rem;

		num= num/10;
		rem= num%10;
		product = product*rem;

		num=num/10;
		rem = num%10;
		product = product*rem;

		num=num/10;
		rem=num%10;
		product = product*rem;


		System.out.print("The product of the all digit is : "+product);

	}
}