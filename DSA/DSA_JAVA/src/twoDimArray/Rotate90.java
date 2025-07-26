package twoDimArray;

import java.util.Arrays;

public class Rotate90 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		rotate90(arr);
	}
	
	public static void rotate90(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(j>i)
				{
					int temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			reverse(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(Arrays.toString(arr[i]));
		}
	}
	
	public static void reverse(int[] ar)
	{
		for(int i=0,j=ar.length-1;i<ar.length/2;i++)
		{
			int temp = ar[i];
			ar[i] = ar[j];
			ar[j] =temp;
		}
	}
}
