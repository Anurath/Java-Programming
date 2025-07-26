package twoDimArray;

import java.util.Arrays;

public class MatrixTranspose {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		transpose(arr);
	}
	
	public static void transpose(int[][] nums)
	{
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums[i].length;j++)
			{
				if(j>i)
				{
					int temp =nums[i][j];
					
					nums[i][j] = nums[j][i];
					nums[j][i] = temp;
				}
			}
		}
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(Arrays.toString(nums[i]));
		}
	}
}
