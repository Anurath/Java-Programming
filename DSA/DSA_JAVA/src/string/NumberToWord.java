package string;

import java.util.Arrays;

public class NumberToWord {

	public static void main(String[] args)
	{
		System.out.println(numberToWord("23,24,345"));
	}
	
	public static String numberToWord(String  num)
	{
		String finalWord = "";
		String temp="";
		for(int i=0;i<num.length()-3;i++)
		{
			if(num.charAt(i)!=',')
			{
				temp+=num.charAt(i);
			}
			else {
				int num1 = Integer.parseInt(temp);
				finalWord+=nToW(num1,num.length()-i-1)+" ";
				temp="";
			}
		}
		
		if(num.length()>2)
		{
			finalWord+=nToW(num.length()-2,2)+" ";
		}
		if(num.length()>1)
		{
			int n1 = Integer.parseInt(num.charAt(num.length()-2)+""+num.charAt(num.length()-1));
			finalWord+=nToW(n1,0)+" ";
		}
		if(num.length()==1)
		{
			finalWord+=nToW((num.charAt(0)-48),0)+" ";
		}
		return finalWord;
	}
	
	public static String nToW(int num,int append)
	{
		
		
		String word = "";
		int[] n = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,30,40,50,60,70,80,90,100,1000,100000,10000000};
		String[] w = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety","hundred","thousand","lack","crore"};
		int i=0;
		boolean found = false;
		for(;i<n.length;i++)
		{
			if(num==n[i])
			{
				found = true;
				word+=w[i];
				break;
			}
		}
		
		if(!found)
		{
			int mainNum = (num/10)*10;
			int j=0;
			for(;j<n.length;j++)
			{
				if(mainNum==n[j])
				{
					break;
				}
			}
			word+=w[j]+" "+w[num%10];
		}
		
		if(append==9)
		{
			word+=" "+w[31];
		}
		else if(append==6)
		{
			word+=" "+w[30];
		}
		else if(append==3)
		{
			word+=" "+w[29];
		}
		else if(append==2)
		{
			word+=" "+w[28];
		}
		
		return word;
	}
}