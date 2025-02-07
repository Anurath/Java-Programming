import java.util.Scanner;
class Divisibility
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();

		String ans = (num%2==0&&num%5==0)?("HiTwoHiFive"):(  (num%2==0)?("HiTwo"):(   (num%5==0)?("HiFive"):("_")   )  );
		System.out.print(ans);
	}
}