class LeetCodeSolution_Q3461
{
	public static void main(String[] args) 
	{
		isEqual("3902");
	}
	public static boolean isEqual(String s)
	{
		String newS="";
		while (s.length()>2)
		{
			newS="";
			for (int i=0;i<s.length()-1;i++)
			{			
				newS+=(((byte)(s.charAt(i)-'0')+(byte)(s.charAt(i+1)-'0')))%10;
			}
			s="";
			s=newS;
		}
		if(s.charAt(0)==s.charAt(1))
			return true;
		else
			return false;
	}
}
