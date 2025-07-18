class LeetCodeSolution_Q349 {
    public int[] intersection(int[] nums1, int[] nums2) {
       int[] ref = new int[nums2.length];

       for(int i=0;i<nums2.length;i++)
       {
        if(ref[i]!=-1)
        {
            int cnt=0;
            for(int j=i+1;j<nums2.length;j++)
            {
                if(nums2[j] == nums2[i])
				{
					ref[j]=-1;
                    cnt++;
				}
            }
			ref[i]=cnt;
        }
       }
	   


		boolean[] ref1 = new boolean[nums2.length];
		int cnt=0;
		for(int i=0;i<nums2.length;i++)
		{
			if(ref[i]>=0)
			{
				for(int j=0;j<nums1.length;j++)
				{
					if(nums2[i]==nums1[j])
					{
						cnt++;
						ref1[i]=true;
						break;
					}
				}
			}
		}

		int[] ans = new int[cnt];

		for(int i=0,k=0;i<ref1.length;i++)
		{
			if(ref1[i]==true)
			{
				ans[k++]=nums2[i];
			}
		}
		return ans;
    }
}