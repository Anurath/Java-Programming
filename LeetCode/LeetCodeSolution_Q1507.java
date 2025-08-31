class LeetCodeSolution_Q1507 {
    public static String reformatDate(String date) {
        String[] str = date.split(" ");
        String ans = str[2];

        switch(str[1])
        {
            case "Jan":
            {
                ans+="-01";
				break;
            }
            case "Feb":
            {
                ans+="-02";
				break;
            }
            case "Mar":
            {
                ans+="-03";
				break;
            }
            case "Apr":
            {
                ans+="-04";
				break;
            }
            case "May":
            {
                ans+="-05";
				break;
            }
            case "Jun":
            {
                ans+="-06";
				break;
            }
            case "Jul":
            {
                ans+="-07";
				break;
            }
            case "Aug":
            {
                ans+="-08";
				break;
            }
            case "Sep":
            {
                ans+="-09";
				break;
            }
            case "Oct":
            {
                ans+="-10";
				break;
            }
            case "Nov":
            {
                ans+="-11";
				break;
            }
            case "Dec":
            {
                ans+="-12";
				break;
            }
        }
        return ans+"-"+num(str[0]);
    }
    public static String num(String s)
    {
        String day = "";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)<='9')
            {
                day+=""+s.charAt(i);
            }
            else
            {
                break;
            }
        }
        if(day.length()==1)
        {
            return "0"+day;
        }
        return day+"";
    }
}