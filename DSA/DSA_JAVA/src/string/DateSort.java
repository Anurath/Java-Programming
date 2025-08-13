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
			
			String mon = ""+dates[i].charAt(2)+dates[i].charAt(3);
			
			String year = ""+dates[i].charAt(7)+dates[i].charAt(8)+dates[i].charAt(9)+dates[i].charAt(10);
			switch(mon)
			{
			 case "Jan":
			 {
				 temp+="01";
				 break;
			 }
			 case "Feb":
			 {
				 temp+="02";
				 break;
			 }
			 case "Mar":
			 {
				 temp+="03";
				 break;
			 }
			 case "Apr":
			 {
				 temp+="04";
				 break;
			 }
			 case "May":
			 {
				 temp+="05";
				 break;
			 }
			 case "Jun":
			 {
				 temp+="06";
				 break;
			 }
			 case "Jul":
			 {
				 temp+="07";
				 break;
			 }
			 case "Aug":
			 {
				 temp+="08";
				 break;
			 }
			 case "Sep":
			 {
				 temp+="09";
				 break;
			 }
			 case "Oct":
			 {
				 temp+="10";
				 break;
			 }
			 
			 case "Nov":
			 {
				 temp+="11";
				 break;
			 }
			 case "Dec":
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
	
	public static int[] sortDates(int[] dates,int[] ref)
	{
		return null;
	}
}
