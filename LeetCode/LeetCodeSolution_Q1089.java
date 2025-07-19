class LeetCodeSolution_Q1089{
    public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				int j=arr.length-1;
				for(;j>i;j--)
				{
					arr[j]=arr[j-1];
				}
				arr[j]=0;
				i++;
			}
		}
    }
}