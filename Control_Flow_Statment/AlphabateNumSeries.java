import java.util.Scanner;
class AlphabateNumSeries
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next().toUpperCase();
		int sum=0;
		int ref=64;
		if (str.length()==1)
		{
			char ch = str.charAt(0);
			int chNum=(int)ch-64;
			System.out.println(chNum);
		}
		else
		{
			char ch1 =str.charAt(0);
			int ch1Num = 27-((int)ch1-64);
			char ch2 = str.charAt(1);
			int ch2Num=(int)ch2-64;
			sum =ch1Num+ch2Num;
		}
		System.out.println(sum);
	}
}