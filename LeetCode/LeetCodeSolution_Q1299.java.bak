class LeetCodeSolution_Q1299{
    public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            int max = -2146473648;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>max)
                {
                    max=arr[j];
                }
            }
            ans[i]=max;
        }
        ans[ans.length-1]=-1;
		return ans;
    }
}