class LeetCodeSolution_Q1539{
    public int findKthPositive(int[] arr, int k) {
        int misNum = 1,cnt=0,i=0;
		while(i<arr.length)
		{
			if(arr[i]==misNum)
			{
				i++;
			}
			else
			{
				cnt++;
			}

			if(cnt==k)
			{
				return misNum;
			}
			misNum++;
		}
        return arr[arr.length-1]+(k-cnt);
    }
}