package string;

import java.util.Arrays;

public class DateSort {

	public static void main(String[] args) {
		
		String[] dates = {"11-Aug-2002","14-Aug-2000","23-Mar-2004"};
		
		sortDate1(dates);
		
	}
	
	public static String[] sortDate1(String[] dates)
	{
		int[] arr = new int[dates.length];
		for(int i=0;i<dates.length;i++)
		{
			String temp="";
			
			String day=""+dates[i].charAt(0)+dates[i].charAt(1);
			
			String mon = ""+dates[i].charAt(3)+dates[i].charAt(4)+dates[i].charAt(5);
			String year = ""+dates[i].charAt(7)+dates[i].charAt(8)+dates[i].charAt(9)+dates[i].charAt(10);
		switch(month(mon))
		{
			 case 249:
			 {
				 temp+="01";
				 break;
			 }
			 case 265:
			 {
				 temp+="02";
				 break;
			 }
			 case 288:
			 {
				 temp+="03";
				 break;
			 }
			 case 291:
			 {
				 temp+="04";
				 break;
			 }
			 case 295:
			 {
				 temp+="05";
				 break;
			 }
			 case 301:
			 {
				 temp+="06";
				 break;
			 }
			 case 299:
			 {
				 temp+="07";
				 break;
			 }
			 case 285:
			 {
				 temp+="08";
				 break;
			 }
			 case 296:
			 {
				 temp+="09";
				 break;
			 }
			 case 294:
			 {
				 temp+="10";
				 break;
			 }
			 
			 case 307:
			 {
				 temp+="11";
				 break;
			 }
			 case 268:
			 {
				 temp+="12";
				 break;
			 }
		}
			temp=mon+day;
			
			temp = year+temp;
			arr[i]=Integer.parseInt(temp);
			
			
		}
		System.out.println(Arrays.toString(arr));
		
		return null;
	}
	
	public static int month(String mon)
	{
		int sum=0;
		for(int i=0;i<mon.length();i++)
		{
			sum+=mon.charAt(i);
		}
		return sum;
	}
	
	public static int[] sortDates(int[] dates,int[] ref)
	{
		return null;
	}
}
