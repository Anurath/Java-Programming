class OtpGen
{
	public static void main(String[] args)
	{
		int otp=0;
		for (; ; )
		{
			otp = (int)(Math.random()*1000000);
			String str = ""+otp;
			int len= str.length();
			if (len==6)
			{
				break;
			}
		}
		System.out.println(otp);
	}
}