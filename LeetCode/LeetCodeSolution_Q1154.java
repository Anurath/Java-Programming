class LeetCodeSolution_Q1154{
    public int dayOfYear(String date) {
        byte month =Byte.parseByte(date.substring(5,7));
		short year = Short.parseShort(date.substring(0,4));
		boolean flag = false;
		if (year%400==0)
		{
			flag = true;
		}
		else if (year%4==0&&!(year%100==0))
		{
			flag = true;
		}
	    short days=Byte.parseByte(date.substring(8,10));
			switch (month-1)
			{
				case 11:
				{
					days+=30;
				}
				case 10:
				{
					days+=31;
				}
				case 9:
				{
					days+=30;
				}
				case 8:
				{
					days+=31;
				}
				case 7:
				{
					days+=31;
				}
				case 6:
				{
					days+=30;
				}
				case 5:
				{
					days+=31;
				}
				case 4:
				{
					days+=30;
				}
				case 3:
				{
					days+=31;
				}
				case 2:
				{
					if (flag)
						days+=29;
					else
						days+=28;
				}
				case 1:
				{
					days+=31;
				}
			}
		return days;
    }
}