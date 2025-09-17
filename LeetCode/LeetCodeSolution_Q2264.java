class LeetCodeSolution_Q2264 {
    public String largestGoodInteger(String num) {
        int max = 0;
        boolean flag = false;
        for(int i=0;i<num.length()-2;i++)
        {
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i+1)==num.charAt(i+2))
			{
				int temp = (num.charAt(i)-48)*100+(num.charAt(i+1)-48)*10+(num.charAt(i+2)-48);
                if(max<=temp)
			    {
				    max = temp;
				    flag = true;
			    }
			}
        }
        if(flag && max ==0)
		{
			return "000";
		}
        return flag?max+"":"";
    }
}