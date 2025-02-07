class SumOfEvenOdd
{
	public static void main(String[] args)
	{
		int num = 1212;
		int evenSum=0;
		int oddSum=0;

		int rem = num%10;
		int temp = (rem%2==0) ? (evenSum=evenSum+rem): (oddSum = oddSum+rem);

		num = num/10;
		rem = num%10;
		temp = (rem%2==0)?  (evenSum=evenSum+rem): (oddSum = oddSum+rem);
		
		num = num/10;
		rem=num%10;
		temp = (rem%2==0)?  (evenSum=evenSum+rem): (oddSum = oddSum+rem);

		num=num/10;
		rem= num%10;
		temp = (rem%2==0)?  (evenSum=evenSum+rem): (oddSum = oddSum+rem);
		
		System.out.print("The sum of Even digits is :"+evenSum);
		System.out.print("the sum of Odd digits is : "+oddSum);
	}
}