class LeetCodeSolution_Q67 {
    public String addBinary(String a, String b) {
        int diff = Math.abs(a.length()-b.length());

		StringBuffer sb1 = new StringBuffer(a);
		StringBuffer sb2 = new StringBuffer(b);
		String repeatedZeros = new String(new char[diff]).replace('\0', '0');
		if(sb1.length()<sb2.length())
		{
			sb1.insert(0,repeatedZeros);
		}
		else if(sb2.length()<sb1.length())
		{
			sb2.insert(0,repeatedZeros);
		}
		System.out.println(sb1);
		System.out.println(sb2);
		StringBuffer ans = new StringBuffer("");
		int carry = 0;
		for(int i=sb1.length()-1;i>=0;i--)
		{
			int x = sb1.charAt(i)-48;
			int y = sb2.charAt(i)-48;
			if(x+y+carry==1)
			{
				ans.insert(0,"1");
				carry=0;
			}
			else if(x+y+carry==0) 
			{
				ans.insert(0,"0");
				carry=0;
			}
			else if(x+y+carry==2)
			{
				ans.insert(0,"0");
				carry=1;
			}
			else if(x+y+carry==3)
			{
				ans.insert(0,"1");
				carry=1;
			}
		}
		if(carry!=0)
		{
			ans.insert(0,"1");
		}
		return new String(ans);
    }
}