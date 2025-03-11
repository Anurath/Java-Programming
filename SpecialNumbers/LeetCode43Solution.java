class LeetCode43Solution
{
	public static void main(String[] args)
	{
		System.out.println(mulStr("12","25"));
	}
	public static String mulStr(String num1,String num2)
	{
		int op=Integer.parseInt(num1)*Integer.parseInt(num2);
		String res=""+op;
		return res;
	}
}