class LeetCodeSolution_Q350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] count = new int[nums1.length];
		int cnt=0;
		for(int i=0;i<nums2.length;i++)
		{
			for(int j=0;j<nums1.length;j++)
			{
				if(count[j]!=-1)
				{
					if(nums2[i]==nums1[j])
					{
						count[j]=-1;
						cnt++;
                        break;
					}
				}
			}
		}

		int[] ans = new int[cnt];

		for(int i=0,j=0;i<count.length;i++)
		{
			if(count[i]==-1)
			{
				ans[j++]=nums1[i];
			}
		}
		return ans;
    }
}