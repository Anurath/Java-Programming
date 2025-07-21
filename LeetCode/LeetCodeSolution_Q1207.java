class LeetCodeSolution_Q1207{
    public boolean uniqueOccurrences(int[] arr) {
        int[] count = new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            if(count[i]!=-1)
            {
                int cnt = 0;
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count[j]=-1;
                        cnt++;
                    }
                }
                count[i]=cnt;
            }
        }
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=-1)
			{
				for(int j=i+1;j<count.length;j++)
				{
					if(count[j]!=-1)
					{
						if(count[i]==count[j])
						{
							return false;
						}
					}
				}
			}
		}
		return true;
    }
}