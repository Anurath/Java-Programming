public class LeetCodeSolution_Q190 {
    // you need treat n as an unsigned value
    public int reverseBits(int num)
	{
		int[] ref = new int[32];
		int i = 0;

		while(num!=0)
		{

			ref[i] =num%2;
			i++;
			num/=2;
		}
		int ans = 0;
		int k =0;
		for(int j=ref.length-1;j>=0;j--)
		{
			if(ref[j]==1)
			{
				ans = ans + (int)Math.pow(2,k);
			}
			k++;
		}
		return ans;
	}
}