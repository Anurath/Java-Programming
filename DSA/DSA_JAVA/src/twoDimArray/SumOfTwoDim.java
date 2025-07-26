package twoDimArray;

import java.util.Arrays;
import java.util.Iterator;

public class SumOfTwoDim {

	public static void main(String[] args)
	{
		int[][] nums = {{1,2,3,4},{2,3,4,5},{6,7,8,100}};
	}
	public static void sum(int[][] nums)
	{
		int sum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				sum+=nums[i][j];
			}
		}
		System.out.println(sum);
	}
	
	public static void diagonalSum(int[][] nums)
	{
		int sum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			 for (int j = 0; j < nums[i].length; j++) {
				if(i==j)
				{
					sum+=nums[i][j];
				}
			}
		}
		System.out.println(sum);
	}
	
	public static void sumOfTwoTwoDimArray(int[][] a , int[][]b)
	{
		boolean flag = true;
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i].length!=b.length))
				{
					flag = false;
				}
			}
		}
		if(flag)
		{
			int[][] c = new int[a.length][a[0].length];
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[0].length;j++)
				{
					c[i][j] = a[i][j]+b[i][j];
				}
			}
			
			for(int i=0;i<c.length;i++)
			{
				System.out.println(Arrays.toString(c[i]));
			}
		}
		else {
			System.out.println("Arrays are not symmetrical");
		}
	}
}
